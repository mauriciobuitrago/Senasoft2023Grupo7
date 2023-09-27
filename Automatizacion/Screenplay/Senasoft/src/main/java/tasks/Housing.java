package tasks;

import io.cucumber.java.da.Men;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.MenuService;

import java.awt.*;

public class Housing implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuService.IconsService),
                Click.on(MenuService.NAVBAR_SEARCH_COUSING),
                Enter.theValue("Colombia").into(MenuService.NAVBAR_SEARCH_COUSING),
                SelectFromOptions.byIndex(1).from(MenuService.NAVBAR_SEARCH_COUSING));
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
