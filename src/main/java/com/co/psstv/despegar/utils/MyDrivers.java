package com.co.psstv.despegar.utils;

import static com.co.psstv.despegar.utils.Constants.ADD_ARGUMENTS_MAXIMIZED;
import static com.co.psstv.despegar.utils.Constants.ENABLE_AUTOMATION;
import static com.co.psstv.despegar.utils.Constants.SET_PRO_CHROME;
import static com.co.psstv.despegar.utils.Constants.SWT;
import static com.co.psstv.despegar.utils.Property.getChromeDriver;
import static com.co.psstv.despegar.utils.Property.getPRO;
import static com.co.psstv.despegar.utils.Property.getURL;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDrivers {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initMyChoromeDriver() {
		Property.load();
		System.setProperty(SET_PRO_CHROME, getPRO().getProperty(getChromeDriver()));
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(ADD_ARGUMENTS_MAXIMIZED);
		chromeOptions.setExperimentalOption(SWT, new String[] { ENABLE_AUTOMATION });
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(15, SECONDS);
		driver.get(getPRO().getProperty(getURL()));
		return driver;

	}

	public static WebDriver closeDriver() {
		if (driver != null) {
			driver.close();

		}
		return driver;

	}

}