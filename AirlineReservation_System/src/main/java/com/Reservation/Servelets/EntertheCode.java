package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyingCode
 */
@WebServlet("/VerifyingCode")
public class EntertheCode extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EntertheCode() {
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
		response.setContentType("text/html;charset=UTF-8");

		try (PrintWriter out = response.getWriter()) {

			String fname = (String) request.getAttribute("First");
			String lname = (String) request.getAttribute("Last");
			String emails = (String) request.getAttribute("Email");
			String pass = (String) request.getAttribute("Pass");

			request.setAttribute("F", fname);
			request.setAttribute("L", lname);
			request.setAttribute("E", emails);
			request.setAttribute("P", pass);

			request.getRequestDispatcher("Verify.jsp").forward(request, response);
		}
	}
}
