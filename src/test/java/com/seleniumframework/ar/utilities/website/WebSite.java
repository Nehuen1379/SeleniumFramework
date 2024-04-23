package com.seleniumframework.ar.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject seleniumFramework;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        seleniumFramework.setDefaultBaseUrl(url);
        seleniumFramework.open();
    }
}
