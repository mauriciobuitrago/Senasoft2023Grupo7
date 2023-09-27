package com.booking.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import com.booking.tasks.Housing;

public class HousingStepDefinition {

    @Given("that the user is on the housing page")
    public void thatTheUserIsOnTheHousingPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html"));
    }

    @When("the user apply the following filters")
    public void theUserApplyTheFollowingFilters() {
        OnStage.theActorInTheSpotlight().attemptsTo(Housing.filters());
    }

    @And("the user reserves the number of rooms of the best option")
    public void theUserReservesTheNumberOfRoomsOfTheBestOption() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("the user fills the forms to reserve the housing with following data")
    public void theUserFillsTheFormsToReserveTheHousingWithFollowingData() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("the the user accept terms and clicks on complete the booking")
    public void theTheUserAcceptTermsAndClicksOnCompleteTheBooking() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should see the booking confirm")
    public void theUserShouldSeeTheBookingConfirm() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
