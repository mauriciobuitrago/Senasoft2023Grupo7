package com.booking.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.booking.com/")
public class IndexPage extends PageObject {
    //locator mapping
    By BTN_LOGIN = By.xpath("(//span[@class='e4adce92df'])[5]");
    By BTN_MODAL_VIEW= By.xpath("(//span[@class='eedba9e88a'])[14]");

    //setters y getters

    public By getBTN_MODAL_VIEW() {
        return BTN_MODAL_VIEW;
    }

    public void setBTN_MODAL_VIEW(By BTN_MODAL_VIEW) {
        this.BTN_MODAL_VIEW = BTN_MODAL_VIEW;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }
}
