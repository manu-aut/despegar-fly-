package com.co.psstv.despegar.stepdefinitions;

import static com.co.psstv.despegar.tasks.Find.cheapFlights;
import static com.co.psstv.despegar.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.co.psstv.despegar.interactions.CloseNotification;
import com.co.psstv.despegar.models.FlyDate;
import com.co.psstv.despegar.tasks.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheapFlightStepDefinitions {

	@When("^mafalda looks at her trip$")
	public void mafaldaLooksAtHerTrip(List<FlyDate> flyDate) {
		theActorCalled(ACTOR).attemptsTo(CloseNotification.closeNotification());
		theActorInTheSpotlight().attemptsTo(cheapFlights(flyDate));
		theActorInTheSpotlight().attemptsTo(Select.date(flyDate));
		theActorInTheSpotlight().attemptsTo(Select.classPassengers(flyDate));
	}

	@Then("^she should view any available flights$")
	public void sheShouldBeShownTheCheapestSingleTicketPrice() {
//		then(theActorInTheSpotlight()).should(seeThat(oneAvailablePrice());
	}

	@Then("^should see the list of available flights$")
	public void shouldSeeTheListOfAvailableFlights() {
//		theActorInTheSpotlight().should(seeThat(greaterThan(0)));

	}

}