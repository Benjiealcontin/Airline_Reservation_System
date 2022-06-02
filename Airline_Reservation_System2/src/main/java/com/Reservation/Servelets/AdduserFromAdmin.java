package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.Users;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdduserFromAdmin
 */
public class AdduserFromAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdduserFromAdmin() {
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

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		Users users = new Users();

		users.setFirstname(fname);
		users.setLastname(lname);
		users.setEmail(email);
		users.setPassword(pass);

		CrudOperation ope = new CrudOperation();
		int i = ope.Adduser(users);

		if (i > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Userlists.jsp");
			rd.include(request, response);
		} else {
			response.sendRedirect("errorhandlers/Failedtoadd.jsp");
		}
	}

}
