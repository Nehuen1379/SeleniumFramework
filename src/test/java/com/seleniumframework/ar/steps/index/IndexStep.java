package com.seleniumframework.ar.steps.index;

import com.seleniumframework.ar.pages.index.IndexPage;
import net.serenitybdd.annotations.Step;

public class IndexStep extends IndexPage {

    @Step("Hacer click en el href FormAuthentication")
    public void clickFormAuthentication(){
        hRefFormAuthentication.click();
    }

    @Step("Hacer click en el href Dropdownlist")
    public void clickDropDownList(){
        hRefDropdown.click();
    }

    @Step("Hacer click en el href Multiple Windows")
    public void clickMultipleWindows(){
        hRefMultipleWindows.click();
    }
}
