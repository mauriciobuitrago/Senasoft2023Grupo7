package com.booking.questions;

import com.booking.userinterfaces.ReservationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;

@Subject("validates that an item found only on the payment gateway is visible")
public class FoundInput implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(ReservationFormPage.LBL_PRICE).viewedBy(actor).resolve();
    }

    public static FoundInput found(){
        return new FoundInput();
    }
}
