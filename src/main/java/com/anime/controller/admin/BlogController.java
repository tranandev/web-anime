package com.anime.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anime.model.BlogModel;
import com.anime.model.PageModel;
import com.anime.paging.PageRequest;
import com.anime.paging.Pageble;
import com.anime.service.IBlogService;
import com.anime.sort.Sorter;
import com.anime.utils.FormUtil;

@WebServlet(urlPatterns = { "/admin-blog" })
public class BlogController extends HttpServlet {
	
	@Inject
	IBlogService blogService;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		if (type != null && type.equals("list")) {
			PageModel page = FormUtil.toModel(PageModel.class, request);

			Pageble pageble = new PageRequest(page.getPage(), page.getMaxPageItem(),
					new Sorter(page.getSortName(), page.getSortBy()));

			request.setAttribute("blogs", blogService.findAll(pageble));
			if(page.getPage() == 1) {	
				page.setTotalItem(blogService.getTotalItem());
				page.setTotalPage((int) Math.ceil((double) page.getTotalItem() / page.getMaxPageItem()));
			}
			
			request.setAttribute("pageModel", page);
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/blog/listblog.jsp");
			rd.forward(request, response);
		} else if (type != null && type.equals("newblog")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/blog/newblog.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("edit")) {
			String id = request.getParameter("id");
			request.setAttribute("blog", blogService.findOneById(id));
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/blog/editblog.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("delete")) {
			String id = request.getParameter("id");
			blogService.delete(id);
			response.sendRedirect(
					request.getContextPath() + "/admin-blog?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        BlogModel blog = FormUtil.toModel(BlogModel.class, request);

        String type = request.getParameter("type");
 	   	if (type.equals("newblog")) {
 		
 			blogService.createNewFilm(blog);
 			response.sendRedirect(request.getContextPath() + "/admin-blog?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
 		} else if (type.equals("edit")) {

 			blogService.editFilm(blog);
 			response.sendRedirect(request.getContextPath() + "/admin-blog?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
 		}
	}

}
