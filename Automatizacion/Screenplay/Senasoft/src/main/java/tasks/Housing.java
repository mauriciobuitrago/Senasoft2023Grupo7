package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuService;

import java.awt.*;

public class Housing implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuService.IconsService),
                Click.on(MenuService.ASK_MODEL_VIEW),
                Click.on(MenuService.NAVBAR_SEARCH_COUSING.of("1")));
    }

    public static Housing filters(){
        return Tasks.instrumented(Housing.class);
    }
}
