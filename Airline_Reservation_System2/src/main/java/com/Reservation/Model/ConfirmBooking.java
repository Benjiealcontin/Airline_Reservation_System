package com.Reservation.Model;

public class ConfirmBooking {
	private int ID;
	private String FlightNo;
	private String Email;
	private String Travel;
	private String Time;
	private String Airportname;
	private String Date;
	private String Travelduration;
	private String Ticketprice;

	public ConfirmBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConfirmBooking(int iD, String flightNo, String email, String travel, String time, String airportname,
			String date, String travelduration, String ticketprice) {
		super();
		ID = iD;
		FlightNo = flightNo;
		Email = email;
		Travel = travel;
		Time = time;
		Airportname = airportname;
		Date = date;
		Travelduration = travelduration;
		Ticketprice = ticketprice;
	}

	public ConfirmBooking(String flightNo, String email, String travel, String time, String airportname, String date,
			String travelduration, String ticketprice) {
		super();
		FlightNo = flightNo;
		Email = email;
		Travel = travel;
		Time = time;
		Airportname = airportname;
		Date = date;
		Travelduration = travelduration;
		Ticketprice = ticketprice;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFlightNo() {
		return FlightNo;
	}

	public void setFlightNo(String flightNo) {
		FlightNo = flightNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTravel() {
		return Travel;
	}

	public void setTravel(String travel) {
		Travel = travel;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getAirportname() {
		return Airportname;
	}

	public void setAirportname(String airportname) {
		Airportname = airportname;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTravelduration() {
		return Travelduration;
	}

	public void setTravelduration(String travelduration) {
		Travelduration = travelduration;
	}

	public String getTicketprice() {
		return Ticketprice;
	}

	public void setTicketprice(String ticketprice) {
		Ticketprice = ticketprice;
	}

}
