package com.booking.steps;

import com.booking.pageobjects.IndexPage;
import com.booking.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegisterStep {
    IndexPage indexPage = new IndexPage();
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void openBrowser() {
        indexPage.open();
    }

    @Step
    public void createAccount(){
        indexPage.getDriver().findElement(indexPage.getBTN_MODAL_VIEW()).click();
        indexPage.getDriver().findElement(indexPage.getBTN_LOGIN()).click();
        indexPage.getDriver().findElement(registerPage.getTXT_EMAIL()).sendKeys("dsbulla8@misena.edu.co");
        indexPage.getDriver().findElement(registerPage.getBTN_EMAIL()).click();
        indexPage.getDriver().findElement(registerPage.getTXT_PASSWORD()).sendKeys("Senasoft2023*");
        indexPage.getDriver().findElement(registerPage.getBTN_LOGIN()).click();
        try {
            Thread.sleep(80000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
