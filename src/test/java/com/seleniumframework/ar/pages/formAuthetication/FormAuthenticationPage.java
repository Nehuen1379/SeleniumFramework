package com.seleniumframework.ar.pages.formAuthetication;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FormAuthenticationPage extends PageObject {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElementFacade txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElementFacade txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btnLogin;


}
