package com.co.psstv.despegar.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.cssSelector;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FlyPage {
	public static final Target SPAN_RESERVE = the("gestiona tu reserva").locatedBy("//*[@id='incentive-login']");
	public static final Target CLOSE_SPAN = the("close span").locatedBy("//*[@id=\"incentive-login\"]/i[2]");

	public static final Target FROM = Target.the("Origen")
			.located(By.xpath("//div[@class='input-container']//input[@placeholder='Ingresa desde dónde viajas']"));
	public static final Target SPAN_ORIGIN = Target.the("selecciona la cuidad")
			.located(By.xpath("//span[@class='item-text']"));

	public static final Target MENU_ALL_OPTIONS = the("gestiona tu reserva")
			.locatedBy("//label[@class='button-circle-label' and contains(text(),'{0}')]");

	public static final Target OPTION_TRAVEL = the("Ida y vuelta | Solo ida | Multidestino")
			.locatedBy("//span[@class='radio-label' and contains(text(),'{0}')]");

	public static final Target TO = the("input origen | destino")
			.locatedBy("//div[@class='input-container']//input[@placeholder='Ingresa hacia dónde viajas']");
	public static final Target SPAN_TO = Target.the("Seleccionar sugerencia")
			.located(By.xpath("//li[@class='item -active']"));
	public static final Target DATE_INIT = Target.the("calendario").located(
			By.xpath("//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']"));

	
//	#pending replace
	public static final Target SELECT_AGE_CHILD_ONE = the("Age child")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div");

	public static final Target SELECT_AGE_CHILD_TWO = the("Age child")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div");

	public static final Target VISIBLE_TEXT_CHILD = the("yOUNGER")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/select");
	public static final Target VISIBLE_TEXT_TWO = the("yOUNGER")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div[2]/div/div/select");
//	================
	public static final Target WARNING_CORONA_VIRUS = Target.the("warning corona virus")
			.located(By.className("shifu-3-message -warning -no-title"));

	public static final Target CLOSE_WARNING = Target.the("warning corona virus").locatedBy(
			"//div[@class='shifu-3-message -warning -no-title']//i[@class='message-close shifu-3-icon-close']");

	public FlyPage() {
		throw new IllegalArgumentException("target not found");
	}
}
