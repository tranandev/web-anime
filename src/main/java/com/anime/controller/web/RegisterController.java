package com.anime.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anime.model.UserModel;
import com.anime.service.IUserService;
import com.anime.utils.FormUtil;

@WebServlet(urlPatterns = { "/dang-ki" })
public class RegisterController extends HttpServlet {

	@Inject
	private IUserService userService;

	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String alert = request.getParameter("alert");
		String message = request.getParameter("message");
		if (message != null && alert != null) {
			request.setAttribute("message", resourceBundle.getString(message));
			request.setAttribute("alert", alert);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserModel newUser = FormUtil.toModel(UserModel.class, request);
		if (newUser.getPassword().equals(newUser.getRepassword())
				&& (userService.findByUserName(newUser.getUserName()) == false)) {
			userService.createNewUser(newUser.getUserName(), newUser.getPassword(), newUser.getEmail());
			response.sendRedirect(request.getContextPath() + "/dang-ki?&message=register_success&alert=success");
		} else {
			response.sendRedirect(
					request.getContextPath() + "/dang-ki?&message=password_repassword_invalid&alert=danger");
		}
	}

}
