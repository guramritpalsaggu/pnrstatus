package com.developer.pnrstatus.JSONclasses;


public class PassengersItem {


	public int no;

	public String currentStatus;

	public String bookingStatus;

	public PassengersItem(int no, String currentStatus, String bookingStatus) {
		this.no = no;
		this.currentStatus = currentStatus;
		this.bookingStatus = bookingStatus;
	}

	public int getNo() {
		return no;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}
}