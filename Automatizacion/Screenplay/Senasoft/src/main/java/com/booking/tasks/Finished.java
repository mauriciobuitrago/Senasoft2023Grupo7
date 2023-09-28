package com.booking.tasks;

import com.booking.userinterfaces.ReservationFormPage;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Visibility;

public class Finished implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            System.out.println("Entro");
            actor.attemptsTo(Click.on(ReservationFormPage.PHONE),
                    Enter.theValue("3102326881").into(ReservationFormPage.PHONE),
                    Scroll.to(ReservationFormPage.CHECK_BOX_FINAL),
                    Click.on(ReservationFormPage.CHECK_BOX_FINAL),
                    Scroll.to(ReservationFormPage.BTN_FINAL),
                    Click.on(ReservationFormPage.BTN_FINAL),
                    Scroll.to(ReservationFormPage.TXT_DATA_RESEVATION));
        } catch (ElementNotFoundException e){
            System.out.println("PASO");
            actor.attemptsTo(Scroll.to(ReservationFormPage.CHECK_BOX_FINAL),
                    Click.on(ReservationFormPage.CHECK_BOX_FINAL),
                    Scroll.to(ReservationFormPage.BTN_FINAL),
                    Click.on(ReservationFormPage.BTN_FINAL),
                    Scroll.to(ReservationFormPage.TXT_DATA_RESEVATION));
        }

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