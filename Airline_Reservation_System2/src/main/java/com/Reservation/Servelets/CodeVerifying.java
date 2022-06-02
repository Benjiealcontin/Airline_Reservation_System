package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Model.Email;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CodeVerifying
 */
public class CodeVerifying extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CodeVerifying() {
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

		request.setAttribute("First", fname);
		request.setAttribute("Last", lname);
		request.setAttribute("Email", email);
		request.setAttribute("Pass", pass);

		HttpSession session = request.getSession();
		Email user = (Email) session.getAttribute("authcode");
		String code = request.getParameter("authcode");

		if (code.equals(user.getCode())) {
			RequestDispatcher rd11 = request.getRequestDispatcher("Adduser");
			rd11.forward(request, response);

		} else {
			response.sendRedirect("errorhandlers/CodeError.jsp");
		}
	}

}
