package com.co.psstv.despegar.models;

public class FlyDate {

	private String menuOption;

	private String from;
	private String to;
	private String departureDate;
	private String returnDate;
	private String adults;
	private String children;
	private String cabinClass;
	private String option;

	public void setMenuOption(String menuOption) {
		this.menuOption = menuOption;
	}

	public String getMenuOption() {
		return menuOption;
	}

	public String getOption() {
		return option;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public String getAdults() {
		return adults;
	}

	public String getChildren() {
		return children;
	}

	public String getCabinClass() {
		return cabinClass;
	}

}
