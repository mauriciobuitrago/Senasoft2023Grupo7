package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSpecificFlights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Enter data to search for flights, click on the search button
        actor.attemptsTo(
                Click.on(FlightPage.DROP_DOWN_FIRST_LOCATION),
                Click.on(FlightPage.TXT_CITY_SELECTED),
                Enter.theValue("bogota").into(FlightPage.TXT_ENTER_CITY),
                Click.on(FlightPage.LBL_DESIRED_CITY),
                Click.on(FlightPage.TXT_FINAL_CITY),
                Enter.theValue("tolima").into(FlightPage.TXT_ENTER_CITY),
                Click.on(FlightPage.LBL_DESIRED_CITY),
                Click.on(FlightPage.TXT_DATES),
                Click.on(FlightPage.DATE_FIRST_ELEMENT),
                Click.on(FlightPage.DATE_SECOND_ELEMENT),
                Click.on(FlightPage.BTN_SEARCH));
    }
    public static  SelectSpecificFlights searchFlightToDestination(){
        return instrumented(SelectSpecificFlights.class);
    }
}
