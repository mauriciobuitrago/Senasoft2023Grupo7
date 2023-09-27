package com.booking.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/housing.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.booking.stepsdefinitions"
)
<<<<<<<< HEAD:Automatizacion/POM/BookingPOM/src/test/java/com/booking/runners/LoginRunner.java
public class LoginRunner {
========

public class HousingRunner {
>>>>>>>> c411d7511a68eb63d1ea615a4cb7b3b7d9c3d62d:Automatizacion/Screenplay/Senasoft/src/test/java/com/booking/runners/HousingRunner.java
}
