package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuService {
    public static final Target IconsService = Target.the("icons to access a service")
            .locatedBy("//ul[@class='c6e9d1599e']//li[1]");

    public static final Target ASK_MODEL_VIEW = Target.the("action to ask a modal view")
            .locatedBy("(//span[@class='eedba9e88a'])[14]");

    public static final Target NAVBAR_SEARCH_COUSING

}
