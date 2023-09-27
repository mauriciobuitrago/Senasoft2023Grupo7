package com.booking.pageobjects;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {
    //locator
    By TXT_EMAIL = By.xpath("//input[@id='username']");
    By BTN_EMAIL = By.xpath("//button[@type='submit']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");
    By TXT_CONFIRM_PASSWORD = By.xpath("//input[@id='confirmed_password']");

    By BTN_LOGIN = By.xpath("(//span[@class='yfCvx60qsR50VNBG15jF'])[2]");

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getBTN_EMAIL() {
        return BTN_EMAIL;
    }

    public void setBTN_EMAIL(By BTN_EMAIL) {
        this.BTN_EMAIL = BTN_EMAIL;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getTXT_CONFIRM_PASSWORD() {
        return TXT_CONFIRM_PASSWORD;
    }

    public void setTXT_CONFIRM_PASSWORD(By TXT_CONFIRM_PASSWORD) {
        this.TXT_CONFIRM_PASSWORD = TXT_CONFIRM_PASSWORD;
    }
}
