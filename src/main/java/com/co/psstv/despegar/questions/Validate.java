package com.co.psstv.despegar.questions;

public class Validate {

	public static AllMessages allMessages(String unsuccessfully) {
		return new AllMessages(unsuccessfully);
	}
	
	public static UnsuccessfullyMessage unsuccessfullyMessage(String unsuccessfully) {
		return new UnsuccessfullyMessage(unsuccessfully);

	}

}
