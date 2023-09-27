package com.booking.stepsdefinitions;

import com.booking.steps.LoginStep;
import com.booking.utils.LoginModel;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {
    //self class instance
    @Steps
    LoginStep loginStep;

    //convert parameters from cucumber-expressions to objects
    @DataTableType
    public LoginModel captureData(Map<String,String> value){
        return new LoginModel(
                value.get("email"),
                value.get("password"));
    }

    //application of feature steps
    @Given("that the user is on the index page")
    public void thatTheUserIsOnTheIndexPage() {
        loginStep.openBrowser();
    }

    @When("the user click on the login button")
    public void theUserClickOnTheLoginButton() {
        loginStep.clickOnLoginButton();
    }

    @And("the user enters the following credentials")
    public void theUserEntersTheFollowingCredentials(List<LoginModel> data) {//data from feature file
        loginStep.enterData(data);
    }

    @Then("the user should see my account icon")
    public void theUserShouldSeeMyAccountIcon() {
        loginStep.validateLogin();
    }
}
