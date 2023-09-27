package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationFormPage {
    public static final Target FIRST_NAME = Target.the("icons to access a service")
            .locatedBy("//input[@id='firstname']");

    public static final Target FIRST_SCROLL = Target.the("icons to access a service")
            .locatedBy("//h2[@class='bui-text--variant-headline_3']");

    public static final Target LAST_NAME = Target.the("icons to access a service")
            .locatedBy("//input[@id='lastname']");

    public static final Target EMAIL = Target.the("icons to access a service")
            .locatedBy("//input[@id='email']");

    public static final Target PHONE = Target.the("icons to access a service")
            .locatedBy("//input[@id='phone']");

    public static final Target TITLE_TO_SCROLL = Target.the("icons to access a service")
            .locatedBy("(//h2[@class='bui-card__title bui-text--variant-headline_3'])[5]");

    public static final Target FINAL_BTN = Target.the("icons to access a service")
            .locatedBy("//button[@name='book']");

    public static final Target THIRD_SCROLL = Target.the("icons to access a service")
            .locatedBy("(//h2[@class='bui-card__title bui-text--variant-headline_3'])[2]");

    public static final Target CHECK_BOX_FINAL = Target.the("icons to access a service")
            .locatedBy("//*[@id='bookForm']/div[3]/div/div/div/label/span");

    public static final Target BTN_FINAL = Target.the("icons to access a service")
            .locatedBy("//*[@id='bookFor']/div[5]/div/div[2]/button");



}
