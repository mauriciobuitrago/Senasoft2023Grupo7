package com.booking.tasks;

import com.booking.userinterfaces.HousingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnSearchButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HousingPage.BTN_SEARCH));
    }

    public static ClickOnSearchButton click(){
        return instrumented(ClickOnSearchButton.class);
    }
}
