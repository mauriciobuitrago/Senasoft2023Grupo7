package com.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import com.booking.userinterfaces.HousingPage;
import com.booking.userinterfaces.MenuService;

public class Housing implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HousingPage.MODAL_VIEW));
        actor.attemptsTo(Click.on(MenuService.IconsService),
                Click.on(HousingPage.COUSING_NAVBAR),
                Enter.theValue("Colombia").into(HousingPage.COUSING_NAVBAR),
                Click.on(HousingPage.DROP_DOWN_LOCATIONS),
                Scroll.to(HousingPage.TITLE_OF_HOUSING_PAGE),
                Click.on(HousingPage.FIRST_DATE),
                Click.on(HousingPage.SECOND_DATE),
                Click.on(HousingPage.ICON_DROP_DOWN),
                Click.on(HousingPage.ADD_ITEMS.of("5")),
                Click.on(HousingPage.ADD_ITEMS.of("7")),
                Click.on(HousingPage.ADD_ITEMS.of("7")),
                Click.on(HousingPage.AGE_CHILDS.of("2")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("2")),
                Click.on(HousingPage.AGE_CHILDS.of("3")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("3")),
                Click.on(HousingPage.ADD_ITEMS.of("10")),
                Click.on(HousingPage.BTN_SEARCH),
                Scroll.to(HousingPage.CONSULTATION_DETAILS),
                Click.on(HousingPage.FILTER_BY_STARS.of("3")),
                Click.on(HousingPage.FILTER_BY_STARS.of("4")),
                Click.on(HousingPage.FILTER_BY_STARS.of("5")),
                Click.on(HousingPage.ORDER_BY_DINAMIC),
                Click.on(HousingPage.DINAMICS_ORDER_OPTIONS));
    }

    public static Housing filters(){
        return Tasks.instrumented(Housing.class);
    }
}
