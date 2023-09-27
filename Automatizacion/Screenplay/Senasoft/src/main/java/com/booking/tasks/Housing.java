package com.booking.tasks;

import io.cucumber.java.da.Men;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import com.booking.userinterfaces.HousingPage;
import com.booking.userinterfaces.MenuService;

import java.awt.*;

public class Housing implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuService.IconsService),
                Click.on(HousingPage.NAVBAR_SEARCH_COUSING),
                Enter.theValue("Colombia").into(HousingPage.NAVBAR_SEARCH_COUSING),
                Click.on(HousingPage.DROP_DOWN_LOCATIONS),
                Scroll.to(HousingPage.TITLE_OF_HOUSING_PAGE),
                Click.on(HousingPage.DATES),
                Click.on(HousingPage.SECOND_DATES),
                Click.on(HousingPage.BTN_SELECT_NUMBER_PEOPLE),
                Click.on(HousingPage.ADD_ITEMS.of("4")),
                Click.on(HousingPage.ADD_ITEMS.of("6")),
                Click.on(HousingPage.ADD_ITEMS.of("6")),
                Click.on(HousingPage.AGE_CHILDS.of("2")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("2")),
                Click.on(HousingPage.AGE_CHILDS.of("3")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("3")),
                Click.on(HousingPage.ADD_ITEMS.of("9")),
                Click.on(HousingPage.BTN_SEARCH),
                Scroll.to(HousingPage.CONSULTATION_DETAILS)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Housing filters(){
        return Tasks.instrumented(Housing.class);
    }
}
