package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HousingPage {

    // Targets for automatization a flow critic
    public static final Target NAVBAR_SEARCH_COUSING = Target.the("navigation bar to search a housing")
            .locatedBy("//input[@id=':re:']");

    public static final Target DROP_DOWN_LOCATIONS = Target.the("first result of the city")
            .locatedBy("//ul[@class='a72ed04875']/li[1]");

    public static final Target TITLE_OF_HOUSING_PAGE = Target.the("tile of the housing page")
            .locatedBy("//*[@data-testid='herobanner-title1']");

    public static final Target CONSULTATION_DETAILS = Target.the("tile with consultation details")
            .locatedBy("(//div[@data-testid='price-for-x-nights'])[1]");



    // in the first parameter, the 1 is first month, the 2 is second month
    // in the second parameter, the  tr is for the rows and td is for columns
    public static final Target DATES = Target.the("select the first date")
            .locatedBy("//div[@class='d4babb55ef']/div[1]/table/tbody/tr[5]/td[6]");

    public static final Target SECOND_DATES = Target.the("select the second date")
            .locatedBy("//div[@class='d4babb55ef']/div[2]/table/tbody/tr[1]/td[6]");

    public static final Target BTN_SELECT_NUMBER_PEOPLE = Target.the("button to open the dropdown")
            .locatedBy("(//button[contains(@class,'d47738b911')])[3]");

    // 3 rest adults
    // 4 add adults
    // 5 rest childs
    // 6 add childs
    // 7 rest rooms
    // 8 add rooms
    // 9 button to ok
    public static final Target ADD_ITEMS = Target.the("btn to add items to the reservation")
            .locatedBy("(//button[contains(@class,'a83ed08757')])[{0}]");

    // number of childs start in 2 = first child and so on - successful with value
    public static final Target AGE_CHILDS = Target.the("age of the childs")
                    .locatedBy("(//div[contains(@class,'a53cbfa6de')])[{0}]/div/select");


    public static final Target BTN_SEARCH = Target.the("btn to search")
            .locatedBy("(//button[contains(@class,'a83ed08757')])[3]");


    public static final Target FILTER_PRICE = Target.the("filter by price")
            .locatedBy("(//*[@class='d819a91462'])[1]");

    public static final Target FILTER_SUSTAINABILITY = Target.the("filter by sustainability")
            .locatedBy("//*[@id='filter_group_SustainablePropertyFilter_:rad:']");

    public static final Target FILTER_OF_STARS = Target.the("filter by stars")
            .locatedBy("//div[@id='filter_group_class_:raf:']/div[{0}]");



}