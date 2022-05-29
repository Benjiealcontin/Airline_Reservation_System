package com.Reservation.Servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.Users;

/**
 * Servlet implementation class Adduser
 */
@WebServlet("/Adduser")
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Adduser() {
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

		String fname = (String) request.getAttribute("First");
		String lname = (String) request.getAttribute("Last");
		String email = (String) request.getAttribute("Email");
		String pass = (String) request.getAttribute("Pass");

		Users users = new Users();

		users.setFirstname(fname);
		users.setLastname(lname);
		users.setEmail(email);
		users.setPassword(pass);

		CrudOperation ope = new CrudOperation();
		int i = ope.Adduser(users);

		if (i > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Userpage.jsp");
			rd.include(request, response);
		} else {
			response.sendRedirect("errorhandlers/Failedtoadd.jsp");
		}

	}

}
