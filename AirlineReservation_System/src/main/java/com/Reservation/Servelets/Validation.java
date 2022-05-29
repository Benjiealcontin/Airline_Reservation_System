package com.Reservation.Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Reservation.Dao.LoginValidation;
import com.Reservation.Model.Admin;
import com.Reservation.Model.Users;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
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

		final String url = "jdbc:mysql://localhost:3306/airline_reservation";
		final String username = "root";
		final String password = "";

		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		Admin admin = new Admin();
		Users user = new Users();

		admin.setEmail(email);
		admin.setPassword(pass);
		user.setEmail(email);
		user.setPassword(pass);

		LoginValidation valid = new LoginValidation();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM `users` WHERE Email ='" + email + "'");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				String fname = rs.getString("Firstname");

				if (valid.AdminValidate(admin)) {
					response.sendRedirect("Adminpage.jsp");
				} else if (valid.UserValidation(user)) {
					HttpSession session = request.getSession();
					session.setAttribute("Firstname", fname);
					request.getRequestDispatcher("Userpage.jsp").forward(request, response);
				} else {
					response.sendRedirect("LoginForm.jsp");
				}
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
