package com.Reservation.Model;

public class Users {
	private int ID;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	private String code;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int iD, String firstname, String lastname, String email, String password, String code) {
		super();
		ID = iD;
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Password = password;
		this.code = code;
	}

	public Users(String firstname, String lastname, String email, String password, String code) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Password = password;
		this.code = code;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
