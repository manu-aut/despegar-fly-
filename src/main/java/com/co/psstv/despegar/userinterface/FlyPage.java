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

	public static final Target START_DATE(String day) {

		final Target DATE_DAY = Target.the("dia inicio")
				.locatedBy("//div[@data-month='2020-09']//div[@class='_dpmg2--dates']//span[" + day + "]");

		return DATE_DAY;
	}

	public static final Target PASSENGERS = Target.the("input numero pasajeros")
			.locatedBy("//div[@class='input-container']//div[@class='sbox-passengers-container']");

	public static final Target MASMAS = Target.the("+")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]");

	public static final Target NUMBER_CHILDREN = Target.the("number children")
			.locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]");

	public static final Target LABEL_SELECT = Target.the("select label")
			.locatedBy("//*[@class='_pnlpk-itemRow_item _pnlpk-select-flight-class-type -medium-down-to-lg']");

	public static final Target OPTION_CLASS = Target.the("option class").locatedBy("//*[contains(text(),'{0}')]");

	public static final Target BUTTON_APPLY = Target.the("button name").locatedBy(
			"//*[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//*[@class='_pnlpk-apply-button sbox-3-btn-ghost _pnlpk-panel__button--link-right -md']");

	public static final Target END_DAY(String day) {

		final Target DATE_DAY = Target.the("return day")
				.locatedBy("//div[@data-month='2020-10']//div[@class='_dpmg2--dates']//span[" + day + "]");

		return DATE_DAY;
	}

	public static final Target BUTTON_SEARCH = the("search button")
			.locatedBy("//*[@class='sbox-button -ml3-l -mt5-l']//em");

	public static final Target PLUS_PASSENGERS = Target.the("input mas pasajeros").locatedBy(
			"//*[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//a[@class='steppers-icon-right sbox-3-icon-plus']");

	public static final Target BTN_BUSCAR = Target.the("button buscar")
			.locatedBy("//*[@class='btn-text' and contains(text(),'Buscar')]");

	public static final Target CHECK_SIN_FECHA = Target.the("checkbok 'Todavía no he decidido'")
			.locatedBy("//*[text()[contains(.,'Todavía no he decidido la fecha')]]");

	public static final Target OPTION_MENU = Target.the("option menu").locatedBy("//*[text()[contains(.,'{0}')]]");

	public static final Target LOGO = the("logo").located(cssSelector("#logo-color"));

	public static final Target LOGO1 = the("logo").locatedBy("//*[@id=\"logo-color\"]");

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
