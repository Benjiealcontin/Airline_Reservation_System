package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.BookingRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateBooking
 */
public class UpdateBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateBooking() {
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
		BookingRequest book = new BookingRequest();
		CrudOperation dao = new CrudOperation();
		book.setID(Integer.parseInt(request.getParameter("ID")));
		book.setFirstname(request.getParameter("fname"));
		book.setLastname(request.getParameter("lname"));
		book.setDOB(request.getParameter("dob"));
		book.setEmail(request.getParameter("email"));
		book.setPhoneNumber(request.getParameter("pnumber"));
		book.setAddress1(request.getParameter("add1"));
		book.setAddress2(request.getParameter("add2"));
		book.setCity(request.getParameter("city"));
		book.setProvincial(request.getParameter("province"));
		book.setZIP_CODE(request.getParameter("zipcode"));
		book.setCountry(request.getParameter("country"));
		book.setDeparture(request.getParameter("departure"));
		book.setReturn(request.getParameter("return"));
		book.setDeparting(request.getParameter("airport"));
		book.setDestination(request.getParameter("destination"));
		book.setFair(request.getParameter("fair"));
		book.setTicket_Price(request.getParameter("ticket"));
		boolean result = dao.UpdateBooking(book);
		System.out.println(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Bookinglists.jsp");
		dispatcher.include(request, response);
		printWriter.print("<br><h2>Booking Details Edited Successfully!!</h2>");
	}

}
