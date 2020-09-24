package com.co.psstv.despegar.stepdefinitions;

import cucumber.api.java.en.Then;

public class GeneralStepDefinitions {

	@Then("^she would not be successful in her search (.*)$")
	public void sheWouldNotBeSuccessful(String unsuccessfully) {
//	theActorInTheSpotlight().should(GivenWhenThen.seeThat(unsuccessfully));
	}

}
