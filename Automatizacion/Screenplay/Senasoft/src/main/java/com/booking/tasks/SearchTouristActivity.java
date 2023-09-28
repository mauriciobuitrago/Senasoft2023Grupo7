package com.booking.tasks;

import com.booking.userinterfaces.TouristActivitiesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTouristActivity implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //process for finding a tourist attraction
        actor.attemptsTo(
                Scroll.to(TouristActivitiesPage.LBL_NEAR_LOCATION),
                Click.on(TouristActivitiesPage.TXT_LOCATION),
                Enter.theValue("Paris").into(TouristActivitiesPage.TXT_LOCATION),
                Click.on(TouristActivitiesPage.LBL_LOCATION),
                Click.on(TouristActivitiesPage.TXT_DATES),
                Click.on(TouristActivitiesPage.TXT_FIRST_DATE),
                Click.on(TouristActivitiesPage.TXT_SECOND_DATE),
                Click.on(TouristActivitiesPage.BTN_SEARCH_TA));
    }
    public static SearchTouristActivity enterData(){
        return instrumented(SearchTouristActivity.class);
    }
}
