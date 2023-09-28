package com.booking.stepsdefinitions;

import com.booking.questions.*;
import com.booking.tasks.*;
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


    //Application of steps to see the breakdown scenario of the price of a flight.
    @Given("the user search a {string}")
    public void theUserSearchA(String option) {
        //The steps from the previous scenario are reused to search for a flight
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectSpecificFlights.searchFlightToDestination());
    }

    @When("the user clicks on price breakdown icon")
    public void theUserClicksOnPriceBreakdownIcon() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnPriceBreakdown.ClickOnPriceBreakdownIcon());
    }

    @Then("user should see a modal view with the price breakdown")
    public void userShouldSeeAModalViewWithThePriceBreakdown() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePriceBreakdown.priceBreakdownFlight(),
                Matchers.is(true)));
    }

    //Application of steps to see the display scenario of the detail of a flight
    @Given("that the user search a {string}")
    public void thatTheUserSearchA(String option) {
        //The steps from the previous scenario are reused to search for a flight
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectSpecificFlights.searchFlightToDestination());
    }

    @When("the user selects a flight and clicks on see flight")
    public void theUserSelectsAFlightAndClicksOnSeeFlight() {
        //display the modal window to see the details of a price
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnSeeFlight.clickOnSeeFlightButton());
    }

    @Then("the user should see a modal view with details of their flight")
    public void theUserShouldSeeAModalViewWithDetailsOfTheirFlight() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSelectFlightButton.isEnableSelectFlightButton(),
                Matchers.is(true)));
    }

    //Step application to view the selection scenario of a flight

    @Given("that the user see the details of any {string}")
    public void thatTheUserSeeTheDetailsOfAny(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectSpecificFlights.searchFlightToDestination());
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnSeeFlight.clickOnSeeFlightButton());
    }
    @When("the user clicks on select")
    public void theUserClicksOnSelect() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickToSelectFlight.clickOnSelectFlightButton());
    }

    @Then("the user should see the tariff section")
    public void theUserShouldSeeTheTariffSection() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TicketPurchaseFlow.validateTicketPurchaseSection(),
                Matchers.is(true)));
    }

    //Step-by-step application to validate one-way flight search scenario
    @Given("that apply the filter one way  for {string}")
    public void thatApplyTheFilterOneWayFor(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnOneWayFlight.clickOneWayButton());
    }
    @When("the user enter the data for the search and clicks on search")
    public void theUserEnterTheDataForTheSearchAndClicksOnSearch() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchOneWayFlight.selectOneWayFlight());
    }

    @Then("the user should see the flights with this filter")
    public void theUserShouldSeeTheFlightsWithThisFilter() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateOneWayFlight.isOneWayButtonSelected(),
                Matchers.is(true)));
    }

}
