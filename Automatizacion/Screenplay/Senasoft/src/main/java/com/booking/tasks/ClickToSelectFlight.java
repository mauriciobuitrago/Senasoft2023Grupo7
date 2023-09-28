package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickToSelectFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightPage.BTN_SELECT_FLIGHT));
    }
    public static ClickToSelectFlight clickOnSelectFlightButton(){
        return instrumented(ClickToSelectFlight.class);
    }
}
