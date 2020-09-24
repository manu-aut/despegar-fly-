package com.co.psstv.despegar.tasks;

import static com.co.psstv.despegar.userinterface.FlyPage.FROM;
import static com.co.psstv.despegar.userinterface.FlyPage.SPAN_ORIGIN;
import static com.co.psstv.despegar.userinterface.FlyPage.SPAN_TO;
import static com.co.psstv.despegar.userinterface.FlyPage.TO;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;
import com.co.psstv.despegar.userinterface.FlyPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class CheapFlights implements Task {

	private FlyDate flyDate;

	public CheapFlights(List<FlyDate> flyDate) {
		this.flyDate = flyDate.get(0);
	}

	@Override
	@Step("{0} find cheap flights")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FlyPage.OPTION_TRAVEL.of(flyDate.getOption())));

		actor.attemptsTo(Enter.theValue(flyDate.getFrom()).into(FROM), Click.on(SPAN_ORIGIN),
				theValue(flyDate.getTo()).into(TO), Click.on(SPAN_TO));

	}

}
