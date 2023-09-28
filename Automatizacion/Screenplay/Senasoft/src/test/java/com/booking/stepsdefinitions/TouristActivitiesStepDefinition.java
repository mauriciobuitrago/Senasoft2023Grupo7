package com.booking.stepsdefinitions;

import com.booking.tasks.ClickOnServiceButton;
import com.booking.tasks.SearchTouristActivity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class TouristActivitiesStepDefinition {

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
    public void theUserShouldSeeTheResultsForTheirSearch() {}

}
