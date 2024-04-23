package com.seleniumframework.ar.pages.dropdownlist;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DropdownPage extends PageObject {

    @FindBy(xpath = "//select[@id='dropdown']")
    protected WebElementFacade cmbDropdownList;
}
