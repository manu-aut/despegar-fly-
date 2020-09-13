package com.co.psstv.despegar.interactions;

import static com.co.psstv.despegar.userinterface.FlyPage.OPTION_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Menu implements Interaction {

	private String optionMenu;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(on(OPTION_MENU.of(optionMenu)));

	}

	public Menu(String optionMenu) {
		this.optionMenu = optionMenu;
	}

	public static Menu menu(String optionMenu) {
		return instrumented(Menu.class, optionMenu);

	}

}