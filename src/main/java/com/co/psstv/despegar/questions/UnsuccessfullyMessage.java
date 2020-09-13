package com.co.psstv.despegar.questions;

import static com.co.psstv.despegar.userinterface.PriceFlights.SPAN_MESSAGE;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class UnsuccessfullyMessage implements Question<Boolean> {

	private String unsuccessfully;

	public UnsuccessfullyMessage(String unsuccessfully) {
		this.unsuccessfully = unsuccessfully;

	}

	@Override
	@Subject("{0} message fail validation")
	public Boolean answeredBy(Actor actor) {
		return of(SPAN_MESSAGE).viewedBy(actor).asString().contains(unsuccessfully);

	}

}