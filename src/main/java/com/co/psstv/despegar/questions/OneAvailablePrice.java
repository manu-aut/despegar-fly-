package com.co.psstv.despegar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class OneAvailablePrice implements Question<AvailablePrices> {

	@Override
	@Step("{0} bla bl")
	public AvailablePrices answeredBy(Actor actor) {
		return AvailablePrices.from();

	}

	public static OneAvailablePrice oneAvailablePrice() {
		return new OneAvailablePrice();
	}

}
