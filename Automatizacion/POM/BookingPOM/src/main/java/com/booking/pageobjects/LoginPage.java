package com.booking.pageobjects;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
    //locator mapping
    By TXT_EMAIL = By.xpath("//input[@id='username']");
    By BTN_EMAIL = By.xpath("//button[@type='submit']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");
    By BTN_LOGIN = By.xpath("(//span[@class='yfCvx60qsR50VNBG15jF'])[2]");
    By LBL_ROBOT = By.xpath("(//span[contains(text(),'o')])[2]");

    //setters y getters
    public By getLBL_ROBOT() {
        return LBL_ROBOT;
    }

    public void setLBL_ROBOT(By LBL_ROBOT) {
        this.LBL_ROBOT = LBL_ROBOT;
    }

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
}
