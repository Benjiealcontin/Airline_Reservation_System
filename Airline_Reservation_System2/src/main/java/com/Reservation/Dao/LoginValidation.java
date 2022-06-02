package com.Reservation.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Reservation.Model.Admin;
import com.Reservation.Model.Users;

public class LoginValidation {

	private final static String url = "jdbc:mysql://localhost:3306/airline_reservation";
	private final static String user = "root";
	private final static String password = "";
	private final static String dbloader = "com.mysql.jdbc.Driver";
	private final static String ADMIN = "SELECT * FROM `admin` WHERE Email =? and Password =?";
	private final static String USER = "SELECT * FROM `users` WHERE Email =? and Password =?";

	public static void Driver(String dbloader) {
		try {

			Class.forName(dbloader);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public boolean AdminValidate(Admin admin) {
		boolean status = false;
		Driver(dbloader);
		Connection con = getConnection();

		try {
			PreparedStatement pst = con.prepareStatement(ADMIN);
			pst.setString(1, admin.getEmail());
			pst.setString(2, admin.getPassword());

			ResultSet rs = pst.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean UserValidation(Users user) {
		boolean status = false;
		Driver(dbloader);
		Connection con = getConnection();

		try {
			PreparedStatement pst = con.prepareStatement(USER);
			pst.setString(1, user.getEmail());
			pst.setString(2, user.getPassword());

			ResultSet rs = pst.executeQuery();

			status = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

}
