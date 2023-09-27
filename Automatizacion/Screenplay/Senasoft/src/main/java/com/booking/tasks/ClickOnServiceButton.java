package com.booking.tasks;

import com.booking.userinterfaces.MenuService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnServiceButton implements Task {

    private final String parameter;

    public ClickOnServiceButton(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (parameter){
            case "housing":
                actor.attemptsTo(Click.on(MenuService.IconsService.of("1")));
                break;
            case "flights":
                actor.attemptsTo(Click.on(MenuService.IconsService.of("2")));
                break;
        }

    }

    public static ClickOnServiceButton clickOnServiceButton(String parameter){
        return instrumented(ClickOnServiceButton.class,parameter);
      }
}
