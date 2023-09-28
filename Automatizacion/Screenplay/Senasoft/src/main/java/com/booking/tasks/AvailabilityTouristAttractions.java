package com.booking.tasks;

import com.booking.userinterfaces.TouristActivitiesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AvailabilityTouristAttractions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TouristActivitiesPage.BTN_CHECK_AVAILABILITY),
                Switch.toNewWindow());//change the browser tab to make the question and statement
    }
    public static AvailabilityTouristAttractions checkAvailability(){
        return instrumented(AvailabilityTouristAttractions.class);
    }
}
