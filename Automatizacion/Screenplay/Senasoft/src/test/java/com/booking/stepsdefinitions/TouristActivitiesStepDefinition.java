package com.booking.stepsdefinitions;

import com.booking.questions.CheckTicketPrice;
import com.booking.questions.FindTouristActivities;
import com.booking.tasks.AvailabilityTouristAttractions;
import com.booking.tasks.ClickOnServiceButton;
import com.booking.tasks.SearchTouristActivity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class TouristActivitiesStepDefinition {

    //Step-by-step application for the search of a tourist attraction
    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
    }

    @When("the user enter the data and clicks on search")
    public void theUserEnterTheDataAndClicksOnSearch() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTouristActivity.enterData());
    }
    @Then("the user should see the results for their search")
    public void theUserShouldSeeTheResultsForTheirSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FindTouristActivities.areThereTouristActivities(),
                Matchers.is(true)));
    }

    //Step-by-step application to visualize the details of a tourist attraction
    @Given("the user is looking for a city to do {string}")
    public void theUserIsLookingForACityToDo(String option) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnServiceButton.clickOnServiceButton(option));
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTouristActivity.enterData());
    }

    @When("the user clicks on see disponibility")
    public void theUserClicksOnSeeDisponibility() {
        OnStage.theActorInTheSpotlight().attemptsTo(AvailabilityTouristAttractions.checkAvailability());
    }

    @Then("the user should see tickets and prices")
    public void theUserShouldSeeTicketsAndPrices() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckTicketPrice.validateRedirectionPage(),
                Matchers.is(true)));
    }
}
