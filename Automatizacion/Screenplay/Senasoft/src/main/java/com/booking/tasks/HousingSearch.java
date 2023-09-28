package com.booking.tasks;

import com.booking.userinterfaces.HousingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class HousingSearch implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HousingPage.COUSING_NAVBAR),
                Enter.theValue("Colombia").into(HousingPage.COUSING_NAVBAR),
                Click.on(HousingPage.DROP_DOWN_LOCATIONS),
                Scroll.to(HousingPage.TITLE_OF_HOUSING_PAGE),
                Click.on(HousingPage.FIRST_DATE),
                Click.on(HousingPage.SECOND_DATE),
                Click.on(HousingPage.ICON_DROP_DOWN),
                Click.on(HousingPage.BTN_ADD_PERSONS.of("5")),
                Click.on(HousingPage.BTN_ADD_PERSONS.of("7")),
                Click.on(HousingPage.BTN_ADD_PERSONS.of("7")),
                Click.on(HousingPage.AGE_CHILDS.of("2")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("2")),
                Click.on(HousingPage.AGE_CHILDS.of("3")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("3")),
                Click.on(HousingPage.BTN_ADD_PERSONS.of("10")),
                Click.on(HousingPage.BTN_SEARCH));
    }

    public static HousingSearch filters(){
        return Tasks.instrumented(HousingSearch.class);
    }

}
