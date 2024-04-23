package com.seleniumframework.ar.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//h4[@class='subheader' and text()='Welcome to the Secure Area. When you are done click logout below.']")
    protected WebElementFacade lblSuccessfulLogin;

    @FindBy(xpath = "//div[@class='flash error']")
    protected WebElementFacade lblFailedLogin;

    @FindBy(xpath = "//select[@id='dropdown']")
    protected WebElementFacade cmbDropdownList;


}
