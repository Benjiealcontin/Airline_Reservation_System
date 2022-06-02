package com.Reservation.Model;

public class Payment {
	private int ID;
	private String Card_Number;
	private String Date;
	private String CVV_code;
	private String Name_of_Owner;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int iD, String card_Number, String date, String cVV_code, String name_of_Owner) {
		super();
		ID = iD;
		Card_Number = card_Number;
		Date = date;
		CVV_code = cVV_code;
		Name_of_Owner = name_of_Owner;
	}

	public Payment(String card_Number, String date, String cVV_code, String name_of_Owner) {
		super();
		Card_Number = card_Number;
		Date = date;
		CVV_code = cVV_code;
		Name_of_Owner = name_of_Owner;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCard_Number() {
		return Card_Number;
	}

	public void setCard_Number(String card_Number) {
		Card_Number = card_Number;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCVV_code() {
		return CVV_code;
	}

	public void setCVV_code(String cVV_code) {
		CVV_code = cVV_code;
	}

	public String getName_of_Owner() {
		return Name_of_Owner;
	}

	public void setName_of_Owner(String name_of_Owner) {
		Name_of_Owner = name_of_Owner;
	}

}
