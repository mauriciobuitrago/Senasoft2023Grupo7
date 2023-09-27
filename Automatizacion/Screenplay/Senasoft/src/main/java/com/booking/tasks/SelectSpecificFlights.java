package com.booking.tasks;

import com.booking.userinterfaces.MenuService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSpecificFlights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(MenuService.IconsService.of("2")));
    }
    public static  SelectSpecificFlights searchFlightToDestination(){
        return instrumented(SelectSpecificFlights.class);
    }
}
