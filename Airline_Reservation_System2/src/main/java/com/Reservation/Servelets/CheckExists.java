package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Reservation.Dao.SendEmail;
import com.Reservation.Model.Email;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckExists
 */
public class CheckExists extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckExists() {
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
		try (PrintWriter out = response.getWriter()) {

			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");

			request.setAttribute("First", fname);
			request.setAttribute("Last", lname);
			request.setAttribute("Email", email);
			request.setAttribute("Pass", pass);

			final String url = "jdbc:mysql://localhost:3306/airline_reservation";
			final String username = "root";
			final String password = "";

			// create instance object of the SendEmail Class
			SendEmail sm = new SendEmail();
			// get the 6-digit code
			String code = sm.getRandom();

			// craete new user using all information
			Email user = new Email(email, code);

			// call the send email method
			boolean test = sm.sendEmail(user);

			// check if the email send successfully
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM `users` WHERE Email =?");
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery();
				boolean status = rs.next();

				if (!status) {
					RequestDispatcher rd = request.getRequestDispatcher("Verify");
					rd.include(request, response);
					HttpSession session = request.getSession();
					session.setAttribute("authcode", user);

				} else {
					response.sendRedirect("errorhandlers/Exists.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
