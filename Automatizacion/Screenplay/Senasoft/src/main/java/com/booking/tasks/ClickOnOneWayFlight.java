package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnOneWayFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightPage.RBN_ONEWAY_FLIGHT));//click on one way radio button
    }
    public static ClickOnOneWayFlight clickOneWayButton(){
        return instrumented(ClickOnOneWayFlight.class);
    }
}
