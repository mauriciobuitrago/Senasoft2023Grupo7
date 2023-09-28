package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TouristAttractionDetailPage {
    //locator to tourist activities details
    public static final Target LBL_TICKETS_PRICES = Target.the("ticketing and pricing label for tourist attractions")
            .locatedBy("//h2[@class='f6431b446c']");
}
