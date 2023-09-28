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


    /*@Then("the user should see the results of their search")
    public void theUserShouldSeeTheResultsOfTheirSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSearchHousing.validation(),
                Matchers.is(true)));
    }*/

}
