package com.booking.steps;

import com.booking.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void openBrowser() {
        registerPage.open();
    }
}
