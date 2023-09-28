package com.booking.questions;

import com.booking.userinterfaces.TicketPurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that the section for purchasing airline tickets is available after executing the step when")
public class TicketPurchaseFlow implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(TicketPurchasePage.LBL_TICKET_TYPE).viewedBy(actor).asBoolean();
    }
    public static final TicketPurchaseFlow validateTicketPurchaseSection(){
        return new TicketPurchaseFlow();
    }
}
