package com.booking.stepsdefinitions;

import com.booking.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class RunnerStepDefinition {

    @Steps
    RegisterStep registerStep;
    @Given("that the user is on the index page")
    public void thatTheUserIsOnTheIndexPage() {
        registerStep.openBrowser();

    }
    /*| email   | password   | confirmPassword   |
      | <email> | <password> | <confirmPassword> |
      Map<String,String> values*/
    @When("the user enter the following personal data")
    public void theUserEnterTheFollowingPersonalData() {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("the user should see my account icon")
    public void theUserShouldSeeMyAccountIcon() {
        // Write code here that turns the phrase above into concrete actions

    }
}
