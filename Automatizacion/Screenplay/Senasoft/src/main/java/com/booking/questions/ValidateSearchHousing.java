package com.booking.questions;

import com.booking.userinterfaces.HousingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateSearchHousing implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(HousingPage.ORDER_BY_DINAMIC).viewedBy(actor).asBoolean();
    }

    public static ValidateSearchHousing validation(){
        return new ValidateSearchHousing();
    }
}
