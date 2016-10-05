package com.test.serenity.stepDefinitions;

import com.test.serenity.steps.GoogleSearchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchStepDefinitions {

  @Steps
  GoogleSearchSteps googleSearchSteps;

  @Given("I want to search in Google")
  public void iWantToSearchInGoogle() throws Throwable {
    googleSearchSteps.openGoogleSearchPage();
  }

  @When("I search for '(.*)'")
  public void iSearchFor(String searchRequest) throws Throwable {
    googleSearchSteps.searchFor(searchRequest);
  }

  @Then("I should see link to '(.*)'")
  public void iShouldSeeLinkTo(String searchResult) throws Throwable {
    googleSearchSteps.verifyResult(searchResult);
  }
}
