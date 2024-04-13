package com.anime.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anime.model.CommentModel;
import com.anime.service.ICommentService;
import com.anime.service.IFilmService;
import com.anime.utils.FormUtil;

@WebServlet(urlPatterns = { "/xem-phim" })
public class FilmController extends HttpServlet {

	@Inject
	IFilmService filmService;

	@Inject
	ICommentService commentService;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getParameter("type");
		String id = request.getParameter("id");
		request.setAttribute("film", filmService.findOneById(id));
		if (type != null && type.equals("details")) {
			request.setAttribute("comment", commentService.findCommentByFilmId(id));
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/film-details.jsp");
			rd.forward(request, response);
		} else if (type != null & type.equals("watch")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/watch.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CommentModel newComment = FormUtil.toModel(CommentModel.class, request);
		String type = request.getParameter("type");
		if (type != null && type.equals("newComment")) {
			commentService.createNewComment(newComment);
			response.sendRedirect(request.getContextPath() + "/xem-phim?type=details&id=1");
		}

	}
}
