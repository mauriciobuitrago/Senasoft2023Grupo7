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

    public static final Target COUNTRY = Target.the("field to enter the country")
            .locatedBy("//div[@class='bp-field-container']/select");

    public static final Target LBL_COUNTRY = Target.the("field to enter the country")
            .locatedBy("//div[@class='bui-grid__column']//label[@class='bp_form__field__label']");



    public static final Target PHONE = Target.the("icons to access a service")
            .locatedBy("//input[@id='phone']");

    // Elements to scroll

    public static final Target TITLE_TO_SCROLL = Target.the("icons to access a service")
            .locatedBy("(//h2[@class='bui-card__title bui-text--variant-headline_3'])[5]");

    public static final Target TXT_DATA_RESEVATION = Target.the("icons to access a service")
            .locatedBy("(//div[@class='bui-card__content'])[1]");

    public static final Target LBL_PRICE = Target.the("icons to access a service")
            .locatedBy("(//div[@class='bui-card__content'])[2]");


    public static final Target BTN_ULTIMATE = Target.the("btn de ultimos pasos")
            .locatedBy("//button[@name='book']");

    public static final Target CHECK_BOX_FINAL = Target.the("icons to access a service")
            .locatedBy("//*[@id='bookForm']/div[3]/div/div/div/label/span");

    public static final Target BTN_FINAL = Target.the("icons to access a service")
            .locatedBy("(//div[@class='bui-group__item']/button)[5]");





}
