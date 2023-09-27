package com.booking.tasks;


import com.booking.userinterfaces.ReservationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class ReservationForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ReservationFormPage.FIRST_SCROLL),
                Click.on(ReservationFormPage.FIRST_NAME),
                Enter.theValue("Juan").into(ReservationFormPage.FIRST_NAME),
                Click.on(ReservationFormPage.LAST_NAME),
                Enter.theValue("Salinas").into(ReservationFormPage.LAST_NAME),
                Click.on(ReservationFormPage.LAST_NAME),
                Enter.theValue("juadsalinas111@gmail.com").into(ReservationFormPage.EMAIL),
                Scroll.to(ReservationFormPage.TITLE_TO_SCROLL),
                Click.on(ReservationFormPage.FINAL_BTN)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static ReservationForm FormData(){
        return Tasks.instrumented(ReservationForm.class);
    }
}
