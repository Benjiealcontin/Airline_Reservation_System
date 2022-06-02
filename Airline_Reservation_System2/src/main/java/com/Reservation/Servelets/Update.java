package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.Users;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update() {
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

		PrintWriter printWriter = response.getWriter();
		Users user = new Users();
		CrudOperation dao = new CrudOperation();
		user.setID(Integer.parseInt(request.getParameter("ID")));
		user.setFirstname(request.getParameter("fname"));
		user.setLastname(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("pass"));
		boolean result = dao.UpdateUser(user);
		System.out.println(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Userlists.jsp");
		dispatcher.include(request, response);
		printWriter.print("<br><h2>User Details Edited Successfully!!</h2>");
	}

}
