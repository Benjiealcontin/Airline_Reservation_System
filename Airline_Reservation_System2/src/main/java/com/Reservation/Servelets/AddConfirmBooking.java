package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.ConfirmBooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddConfirmBooking
 */
public class AddConfirmBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddConfirmBooking() {
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

		String flightno = request.getParameter("flightno");
		String travel = request.getParameter("travel");
		String time = request.getParameter("time");
		String airportname = request.getParameter("airport");
		String date = request.getParameter("date");
		String duration = request.getParameter("duration");
		String ticketprice = request.getParameter("price");

		ConfirmBooking con = new ConfirmBooking();
		con.setFlightNo(flightno);
		con.setTravel(travel);
		con.setTime(time);
		con.setAirportname(airportname);
		con.setDate(date);
		con.setTravelduration(duration);
		con.setTicketprice(ticketprice);

		CrudOperation ope = new CrudOperation();

		int i = ope.Confirm(con);

		if (i > 0) {
			RequestDispatcher rd1 = request.getRequestDispatcher("EmailSender.jsp");
			rd1.include(request, response);
		} else {
			RequestDispatcher rd1 = request.getRequestDispatcher("errorhandlers/FailedtoConfirm.jsp");
			rd1.include(request, response);
		}
	}

}
