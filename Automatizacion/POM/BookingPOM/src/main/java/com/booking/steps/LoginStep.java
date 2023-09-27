package com.booking.steps;

import com.booking.pageobjects.IndexPage;
import com.booking.pageobjects.LoginPage;
import com.booking.utils.LoginModel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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
    public void enterData(List<LoginModel> data){
        LoginModel modelData = data.get(0);//extract data from data list for logging
        indexPage.getDriver().findElement(loginPage.getTXT_EMAIL()).sendKeys(modelData.getEmail());
        indexPage.getDriver().findElement(loginPage.getBTN_EMAIL()).click();
        indexPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys(modelData.getPassword());
        indexPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }

    //scenario validation
    @Step
    public void validateLogin(){
        Assert.assertEquals(indexPage.getDriver().findElement(loginPage.getLBL_ROBOT()).getText(),"o");
    }



}
