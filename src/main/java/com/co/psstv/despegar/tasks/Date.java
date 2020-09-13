package com.co.psstv.despegar.tasks;

import static com.co.psstv.despegar.interactions.SearchDate.beetween;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Date implements Task {

	List<FlyDate> flyDate;

	public Date(List<FlyDate> flyDate) {
		this.flyDate = flyDate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		theActorInTheSpotlight().attemptsTo(beetween(flyDate));

	}

}
