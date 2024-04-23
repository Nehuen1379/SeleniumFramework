package com.seleniumframework.ar.steps.validations;

import com.seleniumframework.ar.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ValidationStep extends ValidationPage {


    @Step("Validar visualizacion del login exitoso")
    public Boolean successfulLoginTextIsVisible(){
        return lblSuccessfulLogin.isDisplayed();
    }

    @Step("Validar visualizacion del login no exitoso")
    public Boolean failedLoginTextIsVisible(){
        return lblFailedLogin.isDisplayed();
    }

    @Step("Validar que la opcion del comboBox sea correcta")
    public String selectedOptionIsCorrect(){
        return cmbDropdownList.getFirstSelectedOptionVisibleText();
    }

}
