package com.booking.questions;

import com.booking.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that the modal window that shows the price breakdown for a flight is displayed")
public class ValidatePriceBreakdown implements Question<Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(FlightPage.LBL_PRICE_BREAKDOWN).viewedBy(actor).asBoolean();//validate that the 'Price Breakdown' text is enabled
    }
    public static ValidatePriceBreakdown priceBreakdownFlight(){
        return new ValidatePriceBreakdown();
    }
}
