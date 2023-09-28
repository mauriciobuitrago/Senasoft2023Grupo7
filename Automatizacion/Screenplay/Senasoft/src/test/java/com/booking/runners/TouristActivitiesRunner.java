package com.booking.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/tourist_activities.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.booking.stepsdefinitions"
)
public class TouristActivitiesRunner {
}
