package com.Reservation.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.Payment;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePayment
 */
public class UpdatePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdatePayment() {
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
		Payment pay = new Payment();
		CrudOperation dao = new CrudOperation();
		pay.setID(Integer.parseInt(request.getParameter("ID")));
		pay.setName_of_Owner(request.getParameter("name"));
		pay.setCard_Number(request.getParameter("cardnum"));
		pay.setDate(request.getParameter("date"));
		pay.setCVV_code(request.getParameter("code"));
		boolean result = dao.UpdatePayment(pay);
		System.out.println(result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Paymentlists.jsp");
		dispatcher.include(request, response);
		printWriter.print("<br><h2>Payment Details Edited Successfully!!</h2>");
	}
}
