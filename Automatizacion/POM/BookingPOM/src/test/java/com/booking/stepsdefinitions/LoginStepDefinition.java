package com.booking.stepsdefinitions;

import com.booking.steps.LoginStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    //self class instance
    @Steps
    LoginStep loginStep;

    //application of feature steps
    @Given("that the user is on the index page")
    public void thatTheUserIsOnTheIndexPage() {
        loginStep.openBrowser();
    }
    /*| email   | password   | confirmPassword   |
      | <email> | <password> | <confirmPassword> |
      Map<String,String> values*/

    @When("the user click on the login button")
    public void theUserClickOnTheLoginButton() {
        loginStep.clickOnLoginButton();
    }

    @And("the user enters the following credentials")
    public void theUserEntersTheFollowingCredentials() {
        loginStep.enterData();
    }

    @Then("the user should see my account icon")
    public void theUserShouldSeeMyAccountIcon() {
        loginStep.validateLogin();
    }
}
