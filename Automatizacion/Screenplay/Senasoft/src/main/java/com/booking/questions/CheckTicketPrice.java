package com.booking.questions;

import com.booking.userinterfaces.TouristAttractionDetailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that you have been redirected to the detail page of a tourist attraction.")
public class CheckTicketPrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(TouristAttractionDetailPage.LBL_TICKETS_PRICES).viewedBy(actor).asBoolean();
    }
    public static CheckTicketPrice validateRedirectionPage(){
        return new CheckTicketPrice();
    }
}
