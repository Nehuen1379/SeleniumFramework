package com.seleniumframework.ar.definitions;

import com.seleniumframework.ar.steps.formAuthentication.FormAuthenticationStep;
import com.seleniumframework.ar.steps.validations.ValidationStep;
import com.seleniumframework.ar.utilities.website.WebSite;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class FormAutheticationDef {

    @Steps(shared = true)
    FormAuthenticationStep fa;

    @Steps(shared = true)
    ValidationStep vs;

    @When("ingrese sus credenciales validas")
    public void userLogInWithValidCredentials(){
        fa.typeUsername("tomsmith");
        fa.typePassword("SuperSecretPassword!");
        fa.clickLogin();
    }

    @Then("la aplicacion muestra un mensaje de ingreso exitoso")
    public void systemShowsSuccessfulLogIn(){
        Assert.assertTrue(vs.successfulLoginTextIsVisible());
    }

    @When("ingrese sus credenciales invalidas")
    public void userLogInWithInvalidCredentials(){
        fa.typeUsername("1234");
        fa.typePassword("1234");
        fa.clickLogin();
    }
    @Then("la aplicacion muestra un mensaje de ingreso fallido")
    public void systemShowsFailedLogIn(){
        Assert.assertTrue(vs.failedLoginTextIsVisible());
    }
}
