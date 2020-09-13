package com.co.psstv.despegar.stepdefinitions;

import static com.co.psstv.despegar.questions.Validate.allMessages;
import static com.co.psstv.despegar.utils.Constants.ACTOR;
import static com.co.psstv.despegar.utils.MyDrivers.closeDriver;
import static com.co.psstv.despegar.utils.MyDrivers.initMyChoromeDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinitions {

	@Before
	public void initBrowser() {
		setTheStage(new OnlineCast());
		theActorCalled(ACTOR).can(with(initMyChoromeDriver()));

	}

	@After
	public void closeDrive() {
		theActorInTheSpotlight().can(with(closeDriver()));
	}

	@Then("^she would not be successful in her search (.*)$")
	public void sheWouldNotBeSuccessful(String unsuccessfully) {
//		theActorInTheSpotlight().should(GivenWhenThen.seeThat(unsuccessfully, unsuccessfullyMessage(unsuccessfully)));
		theActorInTheSpotlight().should(seeThat(allMessages(unsuccessfully)));
	}

}
