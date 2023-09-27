package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuService {
    public static final Target IconsService = Target.the("icons to access a service")
            .locatedBy("//ul[@class='c6e9d1599e']//li[{0}]");

}
