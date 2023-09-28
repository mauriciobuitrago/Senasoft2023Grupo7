package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TouristActivitiesPage {

    public static final Target TXT_LOCATION = Target.the("")
            .locatedBy("//input[@name='query']");
    public static final Target TXT_DATES = Target.the("")
            .locatedBy("//div[@class='css-mh5404']");
    public static final Target LBL_LOCATION = Target.the("")
            .locatedBy("(//li[@class='css-9dv5ti'])[1]");
    public static final Target TXT_FIRST_DATE = Target.the("")
            .locatedBy("//input[@name='start_date']");
    public static final Target LBL_NEAR_LOCATION = Target.the("")
            .locatedBy("(//header[@class='css-a7l5bd'])[2]");
}
