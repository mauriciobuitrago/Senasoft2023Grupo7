package com.booking.tasks;

import com.booking.userinterfaces.ReservationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Finished implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ReservationFormPage.THIRD_SCROLL),
                Click.on(ReservationFormPage.CHECK_BOX_FINAL),
                Click.on(ReservationFormPage.BTN_FINAL));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Finished finishedReservation(){
        return Tasks.instrumented(Finished.class);
    }
}
