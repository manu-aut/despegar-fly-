package com.co.psstv.despegar.interactions;

import static com.co.psstv.despegar.userinterface.FlyPage.CLOSE_SPAN;
import static com.co.psstv.despegar.userinterface.FlyPage.CLOSE_WARNING;
import static com.co.psstv.despegar.userinterface.FlyPage.SPAN_RESERVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.conditions.Check.whether;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;

public class CloseNotification implements Task {

	@Override
	@Subject("#actor close interactions")
	public <T extends Actor> void performAs(T actor) {

		if (CLOSE_WARNING.resolveFor(actor).isVisible()) {
			actor.attemptsTo(Click.on(CLOSE_WARNING));

		}

		actor.attemptsTo(the(SPAN_RESERVE, isVisible()).forNoMoreThan(4).seconds(),
				whether(theReserveMessageIsVisible()).andIfSo(Click.on(CLOSE_SPAN)));

	}

	private Question<Boolean> theReserveMessageIsVisible() {
		return actor -> SPAN_RESERVE.resolveFor(actor).isPresent();

	}

	public static CloseNotification closeNotification() {
		return instrumented(CloseNotification.class);

	}

}
