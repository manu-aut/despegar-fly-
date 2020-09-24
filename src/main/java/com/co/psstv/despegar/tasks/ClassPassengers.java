package com.co.psstv.despegar.tasks;

import static com.co.psstv.despegar.userinterface.FlyPage.SELECT_AGE_CHILD_ONE;
import static com.co.psstv.despegar.userinterface.FlyPage.SELECT_AGE_CHILD_TWO;
import static com.co.psstv.despegar.userinterface.FlyPage.VISIBLE_TEXT_CHILD;
import static com.co.psstv.despegar.userinterface.FlyPage.VISIBLE_TEXT_TWO;
import static com.co.psstv.despegar.utils.Constants.CHILDREN1;
import static com.co.psstv.despegar.utils.Constants.CHILDREN2;
import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.byVisibleText;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClassPassengers implements Task {

	private FlyDate flyDate;

	public ClassPassengers(List<FlyDate> flyDate) {
		this.flyDate = flyDate.get(0);

	}

	@Override
	@Step("{0} select passengers and class ")
	public <T extends Actor> void performAs(T actor) {

		int passengersNumbers = parseInt(flyDate.getAdults());
		actor.attemptsTo(Click.on());

		int childNumber = parseInt(flyDate.getChildren());

		if (childNumber > 0) {

			for (int i = 0; i < childNumber; i++) {
				actor.attemptsTo(Click.on());

			}

			actor.attemptsTo(on(SELECT_AGE_CHILD_ONE), byVisibleText(CHILDREN1).from(VISIBLE_TEXT_CHILD),
					on(SELECT_AGE_CHILD_TWO), byVisibleText(CHILDREN2).from(VISIBLE_TEXT_TWO));

		}
	}
}
