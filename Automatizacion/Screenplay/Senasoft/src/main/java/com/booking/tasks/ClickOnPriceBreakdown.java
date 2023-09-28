package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnPriceBreakdown implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightPage.ICON_QUESTION_PRICE));//click on price breakdown icon to see the modal view
    }
    public static  ClickOnPriceBreakdown ClickOnPriceBreakdownIcon(){
        return instrumented(ClickOnPriceBreakdown.class);
    }
}
