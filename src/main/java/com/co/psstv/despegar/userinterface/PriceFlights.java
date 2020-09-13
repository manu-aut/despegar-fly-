package com.co.psstv.despegar.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.targets.Target;

public class PriceFlights {

	public static final Target SPAN_MESSAGE = the("close span")
			.locatedBy("//div[@id='banners-container']//*[text()[contains(.,'Buscamos, pero no encontramos...')]]");

	public static final Target SPAN_MESSAGE1 = the("close span")
			.locatedBy("//*[@id=\"banner-NO_RESULTS_COVID\"]/div[2]/h5/span");

	public static final Target ALL_PRICE = the("one item")
			.locatedBy("//p[@class='item-fare fare-price']//*[@class='amount price-amount']");
//	Label
	public static final Target ALL_ITEMS = Target.the("final price")
			.locatedBy("//p[@class='item-fare fare-price']//*[text()[contains(.,'Precio final ')]]");

	public PriceFlights() {
		throw new IllegalArgumentException("target not found");
	}

}
