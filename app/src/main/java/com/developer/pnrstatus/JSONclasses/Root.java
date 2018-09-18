package com.developer.pnrstatus.JSONclasses;

import java.util.List;


public class Root {

	public int responseCode;

	public List<PassengersItem> passengers;

	public boolean chartPrepared;

	public String pnr;

	public int debit;

	public String doj;

	public Train train;

	public int totalPassengers;

	public Root(int responseCode, List<PassengersItem> passengers, boolean chartPrepared, String pnr, int debit, String doj, Train train, int totalPassengers) {
		this.responseCode = responseCode;
		this.passengers = passengers;
		this.chartPrepared = chartPrepared;
		this.pnr = pnr;
		this.debit = debit;
		this.doj = doj;
		this.train = train;
		this.totalPassengers = totalPassengers;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public List<PassengersItem> getPassengers() {
		return passengers;
	}

	public boolean isChartPrepared() {
		return chartPrepared;
	}

	public String getPnr() {
		return pnr;
	}

	public int getDebit() {
		return debit;
	}

	public String getDoj() {
		return doj;
	}

	public Train getTrain() {
		return train;
	}

	public int getTotalPassengers() {
		return totalPassengers;
	}
}