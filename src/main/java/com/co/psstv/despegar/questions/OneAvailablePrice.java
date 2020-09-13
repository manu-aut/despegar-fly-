package com.co.psstv.despegar.questions;

import static com.co.psstv.despegar.userinterface.PriceFlights.ALL_PRICE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class OneAvailablePrice implements Question<AvailablePrices> {

	@Override
	@Step("{0} bla bl")
	public AvailablePrices answeredBy(Actor actor) {
		return AvailablePrices.from(ALL_PRICE.resolveFor(actor).isVisible());

	}

	public static OneAvailablePrice oneAvailablePrice() {
		return new OneAvailablePrice();
	}

}
