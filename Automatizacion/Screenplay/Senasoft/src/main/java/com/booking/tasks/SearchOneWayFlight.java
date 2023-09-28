package com.booking.tasks;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchOneWayFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //search for a specific flight but only sending a date corresponding to the departure
        actor.attemptsTo(
                Click.on(FlightPage.DROP_DOWN_FIRST_LOCATION),
                Click.on(FlightPage.TXT_CITY_SELECTED),
                Enter.theValue("bogota").into(FlightPage.TXT_ENTER_CITY),
                Click.on(FlightPage.LBL_DESIRED_CITY),
                Click.on(FlightPage.TXT_FINAL_CITY),
                Enter.theValue("barranquilla").into(FlightPage.TXT_ENTER_CITY),
                Click.on(FlightPage.LBL_DESIRED_CITY),
                Click.on(FlightPage.TXT_DATES),
                Click.on(FlightPage.DATE_SECOND_ELEMENT),
                Click.on(FlightPage.BTN_SEARCH));
    }

    public static  SearchOneWayFlight selectOneWayFlight(){
        return instrumented(SearchOneWayFlight.class);
    }
}
