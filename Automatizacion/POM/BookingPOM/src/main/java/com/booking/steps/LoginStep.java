package com.booking.steps;

import com.booking.pageobjects.IndexPage;
import com.booking.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginStep {
    //class instance
    IndexPage indexPage = new IndexPage();
    LoginPage loginPage = new LoginPage();

    //step logic for the scenario
    @Step
    public void openBrowser() {
        indexPage.open();
    }

    @Step
    public void clickOnLoginButton(){
        indexPage.getDriver().findElement(indexPage.getBTN_MODAL_VIEW()).click();
        indexPage.getDriver().findElement(indexPage.getBTN_LOGIN()).click();
    }

    @Step
    public void enterData(){
        indexPage.getDriver().findElement(loginPage.getTXT_EMAIL()).sendKeys("dsbulla8@misena.edu.co");
        indexPage.getDriver().findElement(loginPage.getBTN_EMAIL()).click();
        indexPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys("Senasoft2023*");
        indexPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }

    //scenario validation
    @Step
    public void validateLogin(){
        Assert.assertEquals(indexPage.getDriver().findElement(loginPage.getLBL_ROBOT()).getText(),"o");
    }



}
