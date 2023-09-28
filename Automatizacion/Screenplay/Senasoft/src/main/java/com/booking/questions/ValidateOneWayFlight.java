package com.booking.questions;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedStatus;

public class ValidateOneWayFlight implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        //Validate that when searching for flights, the one way flight radio button is selected
        return SelectedStatus.of(FlightPage.RBN_ONEWAY_FLIGHT).viewedBy(actor).asBoolean();
    }
    public static ValidateOneWayFlight isOneWayButtonSelected(){
        return new ValidateOneWayFlight();
    }
}
