package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TouristActivitiesPage {

    //locators for the search of tourist attractions
    public static final Target TXT_LOCATION = Target.the("text field to enter the city where you want to go sightseeing")
            .locatedBy("//input[@name='query']");
    public static final Target TXT_DATES = Target.the("text field to enter dates ")
            .locatedBy("//div[@class='css-mh5404']");
    public static final Target LBL_LOCATION = Target.the("label of the city that was searched for sightseeing")
            .locatedBy("(//li[@class='css-9dv5ti'])[1]");
    public static final Target TXT_FIRST_DATE = Target.the("start of the range for search dates")
            .locatedBy("(//table[@class='eb03f3f27f'])[1]/tbody/tr[5]/td[6]");
    public static final Target TXT_SECOND_DATE = Target.the("end value of the search date range ")
            .locatedBy("(//table[@class='eb03f3f27f'])[2]/tbody/tr[2]/td[3]");
    public static final Target LBL_NEAR_LOCATION = Target.the("title of nearby places used for scrolling on the site")
            .locatedBy("(//header[@class='css-a7l5bd'])[2]");
    public static final Target BTN_SEARCH_TA = Target.the("button to search for a tourist attraction")
            .locatedBy("//button[@type='submit']");

    public static final Target BTN_HIGHLIGHTS = Target.the("Button to search for featured tourist activities ")
            .locatedBy("(//label[@class='a53cbfa6de a454023a93'])[1]");

    //locators to check availability
    public static final Target BTN_CHECK_AVAILABILITY = Target.the("button to check the availability of a tourist attraction")
            .locatedBy("(//div[@class='css-spkfbn'])[1]");

}
