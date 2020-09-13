package com.co.psstv.despegar.interactions;

import static com.co.psstv.despegar.userinterface.FlyPage.DATE_INIT;
import static com.co.psstv.despegar.userinterface.FlyPage.END_DAY;
import static com.co.psstv.despegar.userinterface.FlyPage.START_DATE;
import static net.serenitybdd.screenplay.actions.Click.on;

import java.util.ArrayList;
import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchDate implements Interaction {

	private FlyDate flyDate;

	public SearchDate(List<FlyDate> flyDate) {
		this.flyDate = flyDate.get(0);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(DATE_INIT), Click.on(START_DATE(getDateValues(flyDate.getDepartureDate()).get(0))));
		actor.attemptsTo(on(END_DAY(getDateValues(flyDate.getReturnDate()).get(0))));

	}

	private ArrayList<String> getDateValues(String date) {
		String[] arrayStartDate;
		String realDate;
		String[] dateElements;

		arrayStartDate = date.split(", ", 2);
		realDate = arrayStartDate[1];
		dateElements = realDate.split(" ", 3);

		String Day = dateElements[0];
		String Month = dateElements[1];
		String Year = dateElements[2];

		ArrayList<String> dateValues = new ArrayList<String>();

		dateValues.add(Day);
		dateValues.add(Month);
		dateValues.add(Year);

		return dateValues;
	}

	public static SearchDate beetween(List<FlyDate> flyDate) {
		return Tasks.instrumented(SearchDate.class, flyDate);
	}

}
