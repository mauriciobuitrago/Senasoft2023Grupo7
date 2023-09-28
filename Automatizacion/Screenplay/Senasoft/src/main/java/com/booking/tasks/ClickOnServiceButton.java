package com.booking.tasks;

import com.booking.userinterfaces.HousingPage;
import com.booking.userinterfaces.MenuService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnServiceButton implements Task {

    private final String parameter;

    public ClickOnServiceButton(String parameter) {
        this.parameter = parameter;
    }//constructor

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HousingPage.MODAL_VIEW));//eliminate the modal view
        switch (parameter){//choose between services and then clicks on one of them
            case "housing":
                actor.attemptsTo(Click.on(MenuService.IconsService.of("1")));
                break;
            case "flights":
                actor.attemptsTo(Click.on(MenuService.IconsService.of("2")));
                break;
            case "tourist attractions":
                actor.attemptsTo(Click.on(MenuService.IconsService.of("4")));
                break;
        }
    }

    public static ClickOnServiceButton clickOnServiceButton(String parameter){//return the task
        return instrumented(ClickOnServiceButton.class,parameter);
      }
}
