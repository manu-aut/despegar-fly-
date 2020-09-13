package com.co.psstv.despegar.questions;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AllMessages implements Question<Boolean> {

	private String anyErrorMessage;

	public AllMessages(String anyErrorMessage) {
		this.anyErrorMessage = anyErrorMessage;

	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(anyErrorMessage).locatedBy("//*[contains(.,'" + anyErrorMessage + "')]").resolveFor(actor)
				.isVisible();
	}


}