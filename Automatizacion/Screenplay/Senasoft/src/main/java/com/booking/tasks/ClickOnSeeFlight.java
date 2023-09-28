package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnSeeFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightPage.BTN_SEE_FLIGHT));
    }
    public static  ClickOnSeeFlight clickOnSeeFlightButton(){
        return instrumented(ClickOnSeeFlight.class);
    }
}
