package com.anime.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anime.model.FilmModel;
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
/*
		String type = request.getParameter("type");
		if (type != null && type.equals("list")) {
			FilmModel film1 = FormUtil.toModel(FilmModel.class, request);

			Pageble pageble = new PageRequest(film1.getPage(), film1.getMaxPageItem(),
					new Sorter(film1.getSortName(), film1.getSortBy()));

			request.setAttribute("films", blogService.findAll(pageble));
			FilmModel filmModel = new FilmModel();
			filmModel.setTotalItem(filmService.getTotalItem());
			filmModel.setTotalPage((int) Math.ceil((double) filmModel.getTotalItem() / film1.getMaxPageItem()));
			filmModel.setPage(film1.getPage());
			request.setAttribute("filmModel", filmModel);
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/list.jsp");
			rd.forward(request, response);
		} else if (type != null && type.equals("newfilm")) {
			request.setAttribute("category", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/newfilm.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("edit")) {
			String id = request.getParameter("id");
			request.setAttribute("category", categoryService.findAll());
			request.setAttribute("film", filmService.findOneById(id));
			RequestDispatcher rd = request.getRequestDispatcher("/views/admin/edit.jsp");
			rd.forward(request, response);

		} else if (type != null && type.equals("delete")) {
			String id = request.getParameter("id");
			filmService.delete(id);
			response.sendRedirect(
					request.getContextPath() + "/admin-new?type=list&page=1&maxPageItem=5&sortName=title&sortBy=asc");
		} */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
