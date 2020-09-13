package com.co.psstv.despegar.questions;

import static com.co.psstv.despegar.userinterface.PriceFlights.ALL_PRICE;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class TheAllPrices implements Question<Integer> {

	@Override
	@Subject("{0} theActor ...")
	public Integer answeredBy(Actor actor) {
		List<WebElementFacade> items = ALL_PRICE.resolveAllFor(actor);
		for (WebElementFacade element : items) {
			System.out.println("The available flights are:  " + element.getText());
		}
		return items.size();
	}

	public static Question<Integer> displayed() {
		return new TheAllPrices();
	}

}