package com.co.demomobile.lineabase.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/authentication/authentication.feature",
        glue = "com.co.demomobile.lineabase.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Authentication {

}
