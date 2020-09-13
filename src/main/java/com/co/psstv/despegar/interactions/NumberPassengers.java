package com.co.psstv.despegar.interactions;

import static com.co.psstv.despegar.userinterface.FlyPage.MASMAS;
import static com.co.psstv.despegar.userinterface.FlyPage.PASSENGERS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class NumberPassengers implements Interaction {

	private FlyDate flyDate;

	public NumberPassengers(List<FlyDate> flyDate) {
		this.flyDate = flyDate.get(0);
	}

	@Override

	public <T extends Actor> void performAs(T actor) {

		int passengersNumber = Integer.parseInt(flyDate.getAdults());
		actor.attemptsTo(Click.on(PASSENGERS));

		for (int i = 0; i < passengersNumber; i++) {
			actor.attemptsTo(Click.on(MASMAS));

		}

	}

	public static NumberPassengers numPassengers(String variable) {
		return instrumented(NumberPassengers.class, variable);

	}
}
