package com.booking.stepsdefinitions;

import com.booking.questions.FoundInput;
import com.booking.questions.ValidateSearchHousing;
import com.booking.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class HousingStepDefinition {

    @When("the user apply the following filters")
    public void theUserApplyTheFollowingFilters() {
        OnStage.theActorInTheSpotlight().attemptsTo(Housing.filters());
    }

    @And("the user reserves the number of rooms of the best option")
    public void theUserReservesTheNumberOfRoomsOfTheBestOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectResult.enterData());
    }

    @And("the user fills the forms to reserve the housing with following data")
    public void theUserFillsTheFormsToReserveTheHousingWithFollowingData() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReservationForm.FormData());
        OnStage.theActorInTheSpotlight().attemptsTo(Finished.finishedReservation());
    }

    @Then("the user should see the booking confirm")
    public void theUserShouldSeeTheBookingConfirm() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FoundInput.found(),
                Matchers.is(true)));
    }

    // second Scenario

    @When("the user enter the filter data")
    public void theUserEnterTheFilterData() {
        OnStage.theActorInTheSpotlight().attemptsTo(HousingSearch.filters());
    }

    @And("the user clicks on search button")
    public void theUserClicksOnSearchButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnSearchButton.click());
    }

    @Then("the user should see the housings results")
    public void theUserShouldSeeTheHousingsResults() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSearchHousing.validation(),
                Matchers.is(true)));
    }

}