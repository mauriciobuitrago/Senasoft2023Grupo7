package com.booking.stepsdefinitions;

import com.booking.questions.SearchSpecificFlight;
import com.booking.tasks.ClickOnServiceButton;
import com.booking.tasks.SelectSpecificFlights;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class FlightsStepDefinition {
    //application of steps for the flight search scenario for a specific destination
    @Given("that the user is on the {string} page")
    public void thatTheUserIsOnThePage(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
    }

    @When("the user enter the data for her search and clicks on search")
    public void theUserEnterTheDataForHerSearchAndClicksOnSearch() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectSpecificFlights.searchFlightToDestination());
    }
    @Then("the user should see the results of their search")
    public void theUserShouldSeeTheResultsOfTheirSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchSpecificFlight.validateFlightsResults(),
                Matchers.is(true)));
    }
}
