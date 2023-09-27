package com.booking.stepsdefinitions;

import com.booking.tasks.ClickOnServiceButton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class FlightsStepDefinition {


    @Given("that the user is on the {string} page")
    public void thatTheUserIsOnThePage(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
    }

    @When("the user enter the data for her search and clicks on search")
    public void theUserEnterTheDataForHerSearchAndClicksOnSearch() {

    }
    @Then("the user should see the results of their search")
    public void theUserShouldSeeTheResultsOfTheirSearch() {

    }
}
