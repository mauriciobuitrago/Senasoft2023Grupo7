package com.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HousingPage {

    //modal view
    public static final Target MODAL_VIEW = Target.the("modal view for registration")
            .locatedBy("(//span[@class='eedba9e88a'])[14]");

    // Targets for automatization a flow critic
    public static final Target COUSING_NAVBAR = Target.the("navigation bar to search a housing")
            .locatedBy("//input[@id=':re:']");

    public static final Target DROP_DOWN_LOCATIONS = Target.the("drop-down list of results for that country or city")
            .locatedBy("//ul[@class='a72ed04875']/li[1]");

    public static final Target TITLE_OF_HOUSING_PAGE = Target.the("tile of the housing page")
            .locatedBy("//*[@data-testid='herobanner-title1']");

    // function of this target realized a scroll
    public static final Target CONSULTATION_DETAILS = Target.the("paragraph with details on their search")
            .locatedBy("(//div[@data-testid='price-for-x-nights'])[2]");



    // in the first parameter, the 1 is first month, the 2 is second month
    // in the second parameter, the  tr is for the rows and td is for columns
    public static final Target FIRST_DATE = Target.the("select the first date")
            .locatedBy("//div[@class='d4babb55ef']/div[1]/table/tbody/tr[5]/td[6]");

    public static final Target SECOND_DATE = Target.the("select the second date")
            .locatedBy("//div[@class='d4babb55ef']/div[2]/table/tbody/tr[1]/td[6]");

    public static final Target ICON_DROP_DOWN = Target.the("icon to display the drop-down menu")
            .locatedBy("(//button[contains(@class,'d47738b911')])[3]");

    // the following is an explanation of what this parameterized target receives

    // 3 subtract adults
    // 4 add adults
    // 5 substract childs
    // 6 add childs
    // 7 substract rooms
    // 8 add rooms
    // 9 button to ok
    public static final Target ADD_ITEMS = Target.the("btn to add items to the reservation")
            .locatedBy("(//button[contains(@class,'a83ed08757')])[{0}]");

    // number of childs - this start in 2, 2 = first child and so on
    public static final Target AGE_CHILDS = Target.the("age of the childs")
                    .locatedBy("(//div[contains(@class,'a53cbfa6de')])[{0}]/div/select");


    // filters
    public static final Target BTN_SEARCH = Target.the("btn of search")
            .locatedBy("(//button[contains(@class,'a83ed08757')])[3]");

    public static final Target PRICE_FILTER = Target.the("filter by price")
            .locatedBy("(//*[@class='d819a91462'])[1]");

    public static final Target SUSTAINABILITY_FILTER = Target.the("filter by sustainability")
            .locatedBy("//div[@id='filter_group_SustainablePropertyFilter_:rad:']");

    public static final Target FILTER_BY_STARS = Target.the("filter by stars")
            .locatedBy("//div[@data-filters-item='class:class={0}']");

    public static final Target ORDER_BY_DINAMIC = Target.the("filter of order by of form dinamic")
            .locatedBy("//button[@data-testid='sorters-dropdown-trigger']");

    public static final Target DINAMICS_ORDER_OPTIONS = Target.the("List of options for sorting by dinamic forms")
            .locatedBy("//ul[@class='ad7c39949a']/li[3]");



    // result of the search
    public static final Target MESSAGE_OF_SEARCH = Target.the("message with the number of housing found")
            .locatedBy("//*[@id='bodyconstraint-inner']/div[2]/div/div[2]/div[3]/div[2]/div[1]/h1");


    public static final Target FIRST_RESULT = Target.the("first result of housing search")
            .locatedBy("//div[@class='d4924c9e74']/div[3]/div/div[1]/div");

    public static final Target DESCRIBE_OF_RESULTS = Target.the("describe of the first result of housing search")
            .locatedBy("(//span[@class='a53cbfa6de'])[6]");

    // new window
    public static final Target FIRST_BTN_RESERVATION = Target.the("first button to realize a reservation")
            .locatedBy("(//span[@class='bui-button__text'])[2]");

    public static final Target SECOND_BTN_RESEVATION = Target.the("second button to realize a reservation")
            .locatedBy("//div[@class='hprt-reservation-cta']/button");

    public static final Target NUMBER_OF_ROOMS = Target.the("drop-down to realize a reservation")
            .locatedBy("//div[@class='hprt-block']/select");
}