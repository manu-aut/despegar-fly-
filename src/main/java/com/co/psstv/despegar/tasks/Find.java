package com.co.psstv.despegar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

public class Find {
	public static CheapFlights cheapFlights(List<FlyDate> flyDate) {
		return instrumented(CheapFlights.class, flyDate);

	}

}
