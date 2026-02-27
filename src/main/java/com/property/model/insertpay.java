package com.property.model;

public class insertpay {
	private int id;
	private String  paymentoption;
	private String NameofCard;
	private String Amount;
	private String CardNumber;
	private String ExpMonth;
	private String ExpYear;
	private String cvv;
	
	public insertpay(int id, String paymentoption, String NameofCard, String Amount, String CardNumber, String ExpMonth,
			String ExpYear, String cvv) {
		super();
		this.id = id;
		this.paymentoption = paymentoption;
		this.NameofCard = NameofCard;
		this.Amount = Amount;
		this.CardNumber = CardNumber;
		this.ExpMonth = ExpMonth;
		this.ExpYear = ExpYear;
		this.cvv = cvv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentoption() {
		return paymentoption;
	}

	public void setPaymentoption(String paymentoption) {
		this.paymentoption = paymentoption;
	}

	public String getNameofCard() {
		return NameofCard;
	}

	public void setNameofCard(String nameofCard) {
		NameofCard = nameofCard;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpMonth() {
		return ExpMonth;
	}

	public void setExpMonth(String expMonth) {
		ExpMonth = expMonth;
	}

	public String getExpYear() {
		return ExpYear;
	}

	public void setExpYear(String expYear) {
		ExpYear = expYear;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
