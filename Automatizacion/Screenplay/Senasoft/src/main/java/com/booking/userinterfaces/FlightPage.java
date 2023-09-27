package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FlightPage {

    //locators to search for a flight with a specific destination
    public static final Target DROP_DOWN_FIRST_LOCATION = Target.the("dropdown list to select the city of origin")
            .locatedBy("(//span[@class='css-2t25aw'])[1]");
    public static final Target TXT_CITY_SELECTED = Target.the("Maps the element that presents a city selected by default")
            .locatedBy("//span[@class='css-rh2lq6']");
    public static final Target TXT_ENTER_CITY = Target.the("text field to enter the city of origin")
            .locatedBy("//input[@class='css-x72e3o ']");
    public static final Target LBL_DESIRED_CITY = Target.the("searched desired city")
            .locatedBy("//span[@class='css-3cj1dx']");
    public static final Target TXT_FINAL_CITY = Target.the("text field to enter the destination city")
            .locatedBy("(//div[@class='css-1i27l4i'])[2]");

    public static final Target TXT_DATES = Target.the("locate text fields to dates")
            .locatedBy("(//button[@class='css-1ovag24'])[3]");
    public static final Target DATE_FIRST_ELEMENT = Target.the("select a date for arrival day")
            .locatedBy("(//table[@class='Calendar-module__dates___kYFZ9']/tbody/tr[4]/td[7])[1]");

    public static final Target DATE_SECOND_ELEMENT = Target.the("select a date for departure day")
            .locatedBy("(//table[@class='Calendar-module__dates___kYFZ9']/tbody/tr[4]/td[7])[2]");

    public static final Target BTN_SEARCH = Target.the("button to start the flight search")
            .locatedBy("//div[@class='css-1ugzukl']/button");

    public static final Target LBL_RETURN_FLIGHT = Target.the("validation label for the flight search scenario")
            .locatedBy("(//li[@class='Tab-module__item___IqH15'])[5]");


    //locators to view the price breakdown of a flight
    public static final Target ICON_QUESTION_PRICE = Target.the("question icon to display the breakdown of a price for a flight")
            .locatedBy("//span[@class='Button-module__text___YLOOX']/span");

    public static final Target LBL_PRICE_BREAKDOWN = Target.the("")
            .locatedBy("//div[@class='Text-module__root--variant-headline_3___7x4vh css-1ebnygn']");

}
