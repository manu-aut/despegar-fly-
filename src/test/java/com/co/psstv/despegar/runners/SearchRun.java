package com.co.psstv.despegar.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_fly.feature", 
glue = "com/co/psstv/despegar/stepdefinitions", 
		/* tags = "@familiaa", */   snippets = CAMELCASE)
public class SearchRun {

}
