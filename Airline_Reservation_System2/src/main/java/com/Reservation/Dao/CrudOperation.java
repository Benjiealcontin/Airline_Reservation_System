package com.Reservation.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.Reservation.Model.BookingRequest;
import com.Reservation.Model.ConfirmBooking;
import com.Reservation.Model.Payment;
import com.Reservation.Model.Users;

public class CrudOperation {

	private final static String url = "jdbc:mysql://localhost:3306/airline_reservation";
	private final static String user = "root";
	private final static String password = "";
	private final static String dbloader = "com.mysql.jdbc.Driver";

	private final static String ADD_USER = "INSERT INTO `users`(`Firstname`, `Lastname`, `Email`, `Password`) "
			+ "VALUES (?,?,?,?)";
	private final static String ADD_BOOKING = "INSERT INTO `requestbooking`(`Firstname`, `Lastname`, `DOB`, `Email`, `PhoneNumber`, `Address1`, `Address2`, `City`, `Provincial`, `ZIP_Code`, `Country`, `Departure Date & Time`, `Return Date & Time`, `Departing From`, `Destination`, `Fair`, `Ticket_Price`)"
			+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private final static String ADD_PAYMENT = "INSERT INTO `payment`(`Card_Number`, `Date`, `CVV_code`, `Name_of_Owner`) "
			+ "VALUES (?,?,?,?)";
	private final static String CONFIRM_BOOKING = "INSERT INTO `confirmbooking`(`Flight No.`, `Email`, `Travel`, `Time`, `Airport Name`, `Date`, `Travel Duration`, `Ticket Price`) VALUES (?,?,?,?,?,?,?,?)";

	private final static String DELETE_USER = "DELETE FROM `users` WHERE ID = ?";
	private final static String DELETE_BOOKING = "DELETE FROM `requestbooking` WHERE ID = ?";
	private final static String DELETE_PAYMENT = "DELETE FROM `payment` WHERE ID = ?";
	private final static String DELETE_CONFIRMBOOKING = "DELETE FROM `confirmbooking` WHERE ID = ?";

	private final static String UPDATE_USER = "UPDATE `users` SET `Firstname`=?,`Lastname`=?,`Email`=?,`Password`=? WHERE ID = ?";
	private final static String UPDATE_BOOKING = "UPDATE `requestbooking` SET `Firstname`=?,`Lastname`=?,`DOB`=?,`Email`=?,`PhoneNumber`=?,`Address1`=?,`Address2`=?,`City`=?,`Provincial`=?,`ZIP_Code`=?,`Country`=?,`Departure Date & Time`=?,`Return Date & Time`=?,`Departing From`=?,`Destination`=?,`Fair`=?,`Ticket_Price`=? WHERE ID = ?";
	private final static String UPDATE_PAYMENT = "UPDATE `payment` SET `Card_Number`=?,`Date`=?,`CVV_code`=?,`Name_of_Owner`=? WHERE ID =?";
	private final static String UPDATE_CONFIRMBOOKING = "UPDATE `confirmbooking` SET `Flight No.`=?,`Email`=?,`Travel`=?,`Time`=?,`Airport Name`=?,`Date`=?,`Travel Duration`=?,`Ticket Price`=? WHERE ID =?";

	public static void Driver(String dbloader) {
		try {

			Class.forName(dbloader);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

	public static int Adduser(Users user) {
		int i = 0;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(ADD_USER);
			pst.setString(1, user.getFirstname());
			pst.setString(2, user.getLastname());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getPassword());

			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean DeleteUser(int ID) {
		boolean status = true;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(DELETE_USER);
			pst.setInt(1, ID);

			int i = pst.executeUpdate();

			if (i > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean UpdateUser(Users user) {
		int i = 0;

		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(UPDATE_USER);
			pst.setString(1, user.getFirstname());
			pst.setString(2, user.getLastname());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getPassword());
			pst.setInt(5, user.getID());

			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i > 0) {
			return false;
		}
		return true;

	}

	// BOOKING CRUD

	public static int AddBooking(BookingRequest book) {
		int i = 0;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(ADD_BOOKING);
			pst.setString(1, book.getFirstname());
			pst.setString(2, book.getLastname());
			pst.setString(3, book.getDOB());
			pst.setString(4, book.getEmail());
			pst.setString(5, book.getPhoneNumber());
			pst.setString(6, book.getAddress1());
			pst.setString(7, book.getAddress2());
			pst.setString(8, book.getCity());
			pst.setString(9, book.getProvincial());
			pst.setString(10, book.getZIP_CODE());
			pst.setString(11, book.getCountry());
			pst.setString(12, book.getDeparture());
			pst.setString(13, book.getReturn());
			pst.setString(14, book.getDeparting());
			pst.setString(15, book.getDestination());
			pst.setString(16, book.getFair());
			pst.setString(17, book.getTicket_Price());

			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;

	}

	public boolean DeleteBooking(int ID) {
		boolean status = true;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(DELETE_BOOKING);
			pst.setInt(1, ID);

			int i = pst.executeUpdate();

			if (i > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public boolean UpdateBooking(BookingRequest book) {
		int i = 0;

		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(UPDATE_BOOKING);
			pst.setString(1, book.getFirstname());
			pst.setString(2, book.getLastname());
			pst.setString(3, book.getDOB());
			pst.setString(4, book.getEmail());
			pst.setString(5, book.getPhoneNumber());
			pst.setString(6, book.getAddress1());
			pst.setString(7, book.getAddress2());
			pst.setString(8, book.getCity());
			pst.setString(9, book.getProvincial());
			pst.setString(10, book.getZIP_CODE());
			pst.setString(11, book.getCountry());
			pst.setString(12, book.getDeparture());
			pst.setString(13, book.getReturn());
			pst.setString(14, book.getDeparting());
			pst.setString(15, book.getDestination());
			pst.setString(16, book.getFair());
			pst.setString(17, book.getTicket_Price());
			pst.setInt(18, book.getID());

			i = pst.executeUpdate();

			if (i > 0) {
				return false;
			} else {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	// Payment CRUD

	public static int AddPayment(Payment pay) {
		int i = 0;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(ADD_PAYMENT);
			pst.setString(1, pay.getCard_Number());
			pst.setString(2, pay.getDate());
			pst.setString(3, pay.getCVV_code());
			pst.setString(4, pay.getName_of_Owner());

			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;

	}

	public boolean DeletePayment(int ID) {
		boolean status = true;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(DELETE_PAYMENT);
			pst.setInt(1, ID);

			int i = pst.executeUpdate();

			if (i > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean UpdatePayment(Payment pay) {
		int i = 0;
		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(UPDATE_PAYMENT);
			pst.setString(1, pay.getCard_Number());
			pst.setString(2, pay.getDate());
			pst.setString(3, pay.getCVV_code());
			pst.setString(4, pay.getName_of_Owner());
			pst.setInt(5, pay.getID());

			i = pst.executeUpdate();
			if (i > 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	// Confirm Booking

	public static int Confirm(ConfirmBooking con) {
		int i = 0;
		try {
			Driver(dbloader);
			Connection con1 = getConnection();
			PreparedStatement pst = con1.prepareStatement(CONFIRM_BOOKING);
			pst.setString(1, con.getFlightNo());
			pst.setString(2, con.getEmail());
			pst.setString(3, con.getTravel());
			pst.setString(4, con.getTime());
			pst.setString(5, con.getAirportname());
			pst.setString(6, con.getDate());
			pst.setString(7, con.getTravelduration());
			pst.setString(8, con.getTicketprice());

			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean DeleteConfirmBooking(int ID) {
		boolean status = true;

		try {
			Driver(dbloader);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement(DELETE_CONFIRMBOOKING);
			pst.setInt(1, ID);

			int i = pst.executeUpdate();

			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean UpdateConfirmBooking(ConfirmBooking con) {
		int i = 0;

		try {
			Driver(dbloader);
			Connection con1 = getConnection();
			PreparedStatement pst = con1.prepareStatement(UPDATE_CONFIRMBOOKING);
			pst.setString(1, con.getFlightNo());
			pst.setString(2, con.getEmail());
			pst.setString(3, con.getTravel());
			pst.setString(4, con.getTime());
			pst.setString(5, con.getAirportname());
			pst.setString(6, con.getDate());
			pst.setString(7, con.getTravelduration());
			pst.setString(8, con.getTicketprice());
			pst.setInt(9, con.getID());

			i = pst.executeUpdate();

			if (i > 0) {
				return false;
			} else {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
