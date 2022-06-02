package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.BookingRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Addbooking
 */
public class Addbooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Addbooking() {
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
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String pnum = request.getParameter("pnumber");
		String add1 = request.getParameter("add1");
		String add2 = request.getParameter("add2");
		String city = request.getParameter("city");
		String province = request.getParameter("province");
		String zipcode = request.getParameter("zipcode");
		String country = request.getParameter("country");
		String departure = request.getParameter("departure");
		String returns = request.getParameter("return");
		String airport = request.getParameter("airport");
		String destination = request.getParameter("destination");
		String fair = request.getParameter("fair");
		String ticket = request.getParameter("ticket");

		BookingRequest book = new BookingRequest();

		book.setFirstname(fname);
		book.setLastname(lname);
		book.setDOB(dob);
		book.setEmail(email);
		book.setPhoneNumber(pnum);
		book.setAddress1(add1);
		book.setAddress2(add2);
		book.setCity(city);
		book.setProvincial(province);
		book.setZIP_CODE(zipcode);
		book.setCountry(country);
		book.setDeparture(departure);
		book.setReturn(returns);
		book.setDeparting(airport);
		book.setDestination(destination);
		book.setFair(fair);
		book.setTicket_Price(ticket);

		CrudOperation ope = new CrudOperation();

		int i = ope.AddBooking(book);

		if (i > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("destination", destination);
			session.setAttribute("ticket", ticket);
			RequestDispatcher rd1 = request.getRequestDispatcher("Payment2.jsp");
			rd1.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("errorhandlers/Failedtoadd.jsp");
			rd.include(request, response);
		}
	}

}
