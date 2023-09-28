package com.booking.questions;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that within the modal window that shows the details of a flight the select flight button is enabled")
public class ValidateSelectFlightButton implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(FlightPage.BTN_SELECT_FLIGHT).viewedBy(actor).asBoolean();//Evaluate that the flight select button is enabled
    }
    public static ValidateSelectFlightButton isEnableSelectFlightButton(){
        return new ValidateSelectFlightButton();
    }
}
