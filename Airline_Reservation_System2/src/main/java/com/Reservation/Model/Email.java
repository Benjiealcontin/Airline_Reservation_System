package com.Reservation.Model;

public class Email {
	String email;
	String code;

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Email(String email, String code) {
		super();
		this.email = email;
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
