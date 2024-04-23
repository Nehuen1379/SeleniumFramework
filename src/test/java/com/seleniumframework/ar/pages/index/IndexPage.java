package com.seleniumframework.ar.pages.index;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IndexPage extends PageObject {

    @FindBy(xpath = "//a[@href='/login']")
    protected WebElementFacade hRefFormAuthentication;

    @FindBy(xpath = "//a[@href='/dropdown']")
    protected WebElementFacade hRefDropdown;

    @FindBy(xpath = "//a[@href='/windows']")
    protected WebElementFacade hRefMultipleWindows;

}
