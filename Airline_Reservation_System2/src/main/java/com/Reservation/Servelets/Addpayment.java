package com.Reservation.Servelets;

import java.io.IOException;

import com.Reservation.Dao.CrudOperation;
import com.Reservation.Model.Payment;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addpayment
 */
public class Addpayment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Addpayment() {
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

		String name = request.getParameter("ownername");
		String code = request.getParameter("code");
		String date = request.getParameter("date");
		String cardnum = request.getParameter("cardnum");

		Payment pay = new Payment();

		pay.setName_of_Owner(name);
		pay.setCVV_code(code);
		pay.setDate(date);
		pay.setCard_Number(cardnum);

		CrudOperation ope = new CrudOperation();

		int i = ope.AddPayment(pay);

		if (i > 0) {
			response.sendRedirect("success/successbooking.jsp");
		} else {
			response.sendRedirect("Payment2.jsp");
		}

	}

}
