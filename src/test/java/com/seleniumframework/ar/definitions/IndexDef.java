package com.seleniumframework.ar.definitions;

import com.seleniumframework.ar.steps.index.IndexStep;
import com.seleniumframework.ar.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class IndexDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    IndexStep index;

    @Given("que el usuario ingresa al sitio web")
    public void navigateTo(){
        url.navigateTo("https://the-internet.herokuapp.com/");
    }

    @And("hace click en la opcion Form Authentication")
    public void userClicksOnFormAuthetication() {
        index.clickFormAuthentication();
    }

    @And("hace click en la opcion Dropdownlist")
    public void userClicksOnDropDownList() {
        index.clickDropDownList();
    }

    @And("hace click en la opcion Multiple Windows")
    public void userClicksOnMultipleWindows() {
        index.clickMultipleWindows();
    }
}
