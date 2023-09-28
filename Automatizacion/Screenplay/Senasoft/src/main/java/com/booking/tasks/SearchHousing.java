package com.booking.tasks;

import com.booking.userinterfaces.HousingPage;
import com.booking.userinterfaces.MenuService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SearchHousing implements Task {
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
                Click.on(HousingPage.ADD_ITEMS.of("4")),
                Click.on(HousingPage.ADD_ITEMS.of("6")),
                Click.on(HousingPage.ADD_ITEMS.of("6")),
                Click.on(HousingPage.AGE_CHILDS.of("2")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("2")),
                Click.on(HousingPage.AGE_CHILDS.of("3")),
                SelectFromOptions.byValue("6").from(HousingPage.AGE_CHILDS.of("3")),
                Click.on(HousingPage.ADD_ITEMS.of("9")));
    }

    public static SearchHousing filters(){
        return Tasks.instrumented(SearchHousing.class);
    }
}
