package com.co.psstv.despegar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

public class Select {
	public static Date date(List<FlyDate> flyDate) {
		return instrumented(Date.class, flyDate);
	}
	
	
	public static ClassPassengers classPassengers(List<FlyDate> flyDate) {
		return instrumented(ClassPassengers.class, flyDate);
	}

	
}
