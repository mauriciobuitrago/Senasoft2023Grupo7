package com.booking.questions;

import com.booking.userinterfaces.TouristActivitiesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.CurrentVisibility;


@Subject("Validate that the filter button for highlighted results is active.")
public class FindTouristActivities implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(TouristActivitiesPage.BTN_HIGHLIGHTS).viewedBy(actor).asBoolean();
    }
    public static FindTouristActivities areThereTouristActivities(){
        return  new FindTouristActivities();
    }
}
