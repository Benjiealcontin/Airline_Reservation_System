package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Dao.LoginValidation;
import com.Reservation.Model.Admin;
import com.Reservation.Model.Users;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		Admin admin = new Admin();
		Users user = new Users();

		admin.setEmail(email);
		admin.setPassword(pass);

		user.setEmail(email);
		user.setPassword(pass);

		LoginValidation valid = new LoginValidation();

		if (valid.AdminValidate(admin)) {
			response.sendRedirect("Adminpage.jsp");
		} else if (valid.UserValidation(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			response.sendRedirect("Userpage.jsp");
		} else {
			response.sendRedirect("LoginForm.jsp");
		}
	}

}
