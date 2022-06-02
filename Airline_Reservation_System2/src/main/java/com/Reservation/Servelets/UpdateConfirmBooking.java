package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.ConfirmBooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateConfirmBooking
 */
public class UpdateConfirmBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateConfirmBooking() {
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
		ConfirmBooking book = new ConfirmBooking();
		CrudOperation dao = new CrudOperation();
		book.setID(Integer.parseInt(request.getParameter("ID")));
		book.setFlightNo(request.getParameter("flightno."));
		book.setEmail(request.getParameter("email"));
		book.setTravel(request.getParameter("travel"));
		book.setTime(request.getParameter("time"));
		book.setAirportname(request.getParameter("airport"));
		book.setDate(request.getParameter("date"));
		book.setTravelduration(request.getParameter("duration"));
		book.setTicketprice(request.getParameter("price"));
		boolean result = dao.UpdateConfirmBooking(book);
		System.out.println(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Confirm_Bookinglists.jsp");
		dispatcher.include(request, response);
		printWriter.print("<br><h2>Payment Details Edited Successfully!!</h2>");
	}

}
