package com.anime.controller.admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.anime.model.FilmModel;
import com.anime.model.PageModel;
import com.anime.paging.PageRequest;
import com.anime.paging.Pageble;
import com.anime.service.ICategoryService;
import com.anime.service.IFilmService;
import com.anime.sort.Sorter;
import com.anime.utils.FormUtil;

@WebServlet(urlPatterns = { "/admin-new" })
public class NewController extends HttpServlet {
	@Inject
	private IFilmService filmService;

	@Inject
	private ICategoryService categoryService;

	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "images/film";
	private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getParameter("type");
		if (type != null && type.equals("list")) {
			PageModel page = FormUtil.toModel(PageModel.class, request);

			Pageble pageble = new PageRequest(page.getPage(), page.getMaxPageItem(),
					new Sorter(page.getSortName(), page.getSortBy()));

			request.setAttribute("films", filmService.findAll(pageble));
			if(page.getPage() == 1) {	
				page.setTotalItem(filmService.getTotalItem());
				page.setTotalPage((int) Math.ceil((double) page.getTotalItem() / page.getMaxPageItem()));
			}
			
			request.setAttribute("pageModel", page);
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/film/listfilm.jsp");
			rd.forward(request, response);
		} else if (type != null && type.equals("newfilm")) {
			request.setAttribute("category", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/film/newfilm.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("edit")) {
			String id = request.getParameter("id");
			request.setAttribute("category", categoryService.findAll());
			request.setAttribute("film", filmService.findOneById(id));
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/film/editfilm.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("delete")) {
			String id = request.getParameter("id");
			filmService.delete(id);
			response.sendRedirect(
					request.getContextPath() + "/admin-new?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		FilmModel film = new FilmModel();
		if (type.equals("newfilm")) {
			if (!ServletFileUpload.isMultipartContent(request)) {
				PrintWriter writer = response.getWriter();
				writer.println("Request does not contain upload data");
				writer.flush();
				return;
			}

			photoUpload(request, film);
			filmService.createNewFilm(film);
			response.sendRedirect(
					request.getContextPath() + "/admin-new?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
		} else if (type.equals("edit")) {

			photoUpload(request, film);
			filmService.editFilm(film);
			response.sendRedirect(
					request.getContextPath() + "/admin-new?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
		}

	}

	private void photoUpload(HttpServletRequest request, FilmModel film) {

		// cấu hình upload
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(THRESHOLD_SIZE);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);
		// khởi tạo đường dẫn upload file
		String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
		// tạo thư mục upload nếu chưa tồn tại
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		// khởi tạo biến pictureold trong trường hợp sửa dữ liệu
		String oldPhoto = null;
		try {
			// phân tích request để lấy dữ liệu
			List<FileItem> formItems = upload.parseRequest(request);
			// lấy bộ lặp chứa các fileitem
			@SuppressWarnings("rawtypes")
			Iterator iter = formItems.iterator();
			// lặp qua từng trường trên form
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				// xử lý trường tệp tin
				if (!item.isFormField()) {
					film.setPhoto(null);
					if (item.getSize() > 0) {
						// lấy tên file upload
						String fileName = new File(item.getName()).getName();
						// tạo đường dẫn file upload
						String filePath = uploadPath + File.separator + fileName;
						// tạo đối tượng file lưu trữ
						File storeFile = new File(filePath);
						// lưu tệp tin upload
						item.write(storeFile);
						// set tên picture
						film.setPhoto(fileName);
					}
				} else {

					// lấy dữ liệu của trường trên form
					String data = item.getString("UTF-8");

					if (item.getFieldName().equals("id")) {
						film.setId(Long.parseLong(data));
					} else if (item.getFieldName().equals("title")) {
						film.setTitle(data);
					} else if (item.getFieldName().equals("categoryId")) {
						film.setCategoryId(Integer.parseInt(data));
					} else if (item.getFieldName().equals("episode")) {
						film.setEpisode(Integer.parseInt(data));
					} else if (item.getFieldName().equals("currentEpisode")) {
						film.setCurrentEpisode(Integer.parseInt(data));
					} else if (item.getFieldName().equals("oldPhoto")) {
						oldPhoto = data;
					}
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (film.getPhoto() == null) {
			film.setPhoto(oldPhoto);
		}
	}

}
