package com.Reservation.Model;

public class BookingRequest {
	private int ID;
	private String Firstname;
	private String Lastname;
	private String DOB;
	private String Email;
	private String PhoneNumber;
	private String Address1;
	private String Address2;
	private String City;
	private String Provincial;
	private String ZIP_CODE;
	private String Country;
	private String Departure;
	private String Return;
	private String Departing;
	private String Destination;
	private String Fair;
	private String Ticket_Price;

	public BookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingRequest(int iD, String firstname, String lastname, String dOB, String email, String phoneNumber,
			String address1, String address2, String city, String provincial, String zIP_CODE, String country,
			String departure, String return1, String departing, String destination, String fair, String ticket_Price) {
		super();
		ID = iD;
		Firstname = firstname;
		Lastname = lastname;
		DOB = dOB;
		Email = email;
		PhoneNumber = phoneNumber;
		Address1 = address1;
		Address2 = address2;
		City = city;
		Provincial = provincial;
		ZIP_CODE = zIP_CODE;
		Country = country;
		Departure = departure;
		Return = return1;
		Departing = departing;
		Destination = destination;
		Fair = fair;
		Ticket_Price = ticket_Price;
	}

	public BookingRequest(String firstname, String lastname, String dOB, String email, String phoneNumber,
			String address1, String address2, String city, String provincial, String zIP_CODE, String country,
			String departure, String return1, String departing, String destination, String fair, String ticket_Price) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		DOB = dOB;
		Email = email;
		PhoneNumber = phoneNumber;
		Address1 = address1;
		Address2 = address2;
		City = city;
		Provincial = provincial;
		ZIP_CODE = zIP_CODE;
		Country = country;
		Departure = departure;
		Return = return1;
		Departing = departing;
		Destination = destination;
		Fair = fair;
		Ticket_Price = ticket_Price;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getProvincial() {
		return Provincial;
	}

	public void setProvincial(String provincial) {
		Provincial = provincial;
	}

	public String getZIP_CODE() {
		return ZIP_CODE;
	}

	public void setZIP_CODE(String zIP_CODE) {
		ZIP_CODE = zIP_CODE;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getDeparture() {
		return Departure;
	}

	public void setDeparture(String departure) {
		Departure = departure;
	}

	public String getReturn() {
		return Return;
	}

	public void setReturn(String return1) {
		Return = return1;
	}

	public String getDeparting() {
		return Departing;
	}

	public void setDeparting(String departing) {
		Departing = departing;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getFair() {
		return Fair;
	}

	public void setFair(String fair) {
		Fair = fair;
	}

	public String getTicket_Price() {
		return Ticket_Price;
	}

	public void setTicket_Price(String ticket_Price) {
		Ticket_Price = ticket_Price;
	}

}
