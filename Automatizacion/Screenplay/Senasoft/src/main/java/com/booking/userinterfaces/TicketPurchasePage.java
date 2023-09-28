package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TicketPurchasePage {
    //locators to complete data and purchase options for flight tickets
    public static final Target LBL_TICKET_TYPE = Target.the("text indicating the types of tickets available for purchase")
            .locatedBy("//div[@class='css-1f10jkc']/div/h2");
}
