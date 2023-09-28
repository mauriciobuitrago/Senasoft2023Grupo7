package com.booking.tasks;

import com.booking.userinterfaces.HousingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectResult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(HousingPage.DESCRIBE_OF_RESULTS),
                Click.on(HousingPage.FIRST_RESULT),
                Switch.toNewWindow());

        actor.attemptsTo(Click.on(HousingPage.FIRST_BTN_RESERVATION),
                Click.on(HousingPage.NUMBER_OF_ROOMS),
                SelectFromOptions.byValue("1").from(HousingPage.NUMBER_OF_ROOMS),
                Click.on(HousingPage.SECOND_BTN_RESEVATION));
    }

    public static SelectResult enterData(){
        return instrumented(SelectResult.class);
    }

}
