package com.booking.tasks;


import com.booking.questions.FoundInput;
import com.booking.questions.ValidateSearchHousing;
import com.booking.userinterfaces.ReservationFormPage;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Enabled;
import org.hamcrest.Matchers;

public class ReservationForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ReservationFormPage.TXT_FIRST_SCROLL),
                Click.on(ReservationFormPage.TXT_FIRST_NAME),
                Enter.theValue("Juan").into(ReservationFormPage.TXT_FIRST_NAME),
                Click.on(ReservationFormPage.TXT_LAST_NAME),
                Enter.theValue("Salinas").into(ReservationFormPage.TXT_LAST_NAME),
                Click.on(ReservationFormPage.TXT_LAST_NAME),
                Enter.theValue("juadsalinas@gmail.com").into(ReservationFormPage.TXT_EMAIL));

        try {
            System.out.println("Entro");
            actor.attemptsTo(Click.on(ReservationFormPage.PHONE),
                    Enter.theValue("3204568792").into(ReservationFormPage.PHONE),
                    Scroll.to(ReservationFormPage.BTN_ULTIMATE),
                    Click.on(ReservationFormPage.BTN_ULTIMATE)
            );
        } catch (ElementNotFoundException e) {
            System.out.println("PASO");
            actor.attemptsTo(Scroll.to(ReservationFormPage.BTN_ULTIMATE),
                    Click.on(ReservationFormPage.BTN_ULTIMATE));
        }

    }

    public static ReservationForm FormData(){
        return Tasks.instrumented(ReservationForm.class);
    }
}
