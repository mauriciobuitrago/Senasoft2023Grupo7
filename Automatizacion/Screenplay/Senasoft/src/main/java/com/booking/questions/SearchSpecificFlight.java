package com.booking.questions;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that an element that is only available for flight results is active")
public class SearchSpecificFlight implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(FlightPage.LBL_RETURN_FLIGHT).viewedBy(actor).resolveAll();//evaluates whether the element is enabled
    }

    public static SearchSpecificFlight validateFlightsResults(){
        return new SearchSpecificFlight();
    }
}
