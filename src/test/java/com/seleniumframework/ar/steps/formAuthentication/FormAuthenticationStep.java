package com.seleniumframework.ar.steps.formAuthentication;

import com.seleniumframework.ar.pages.formAuthetication.FormAuthenticationPage;
import net.serenitybdd.annotations.Step;

public class FormAuthenticationStep extends FormAuthenticationPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txtUsername.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txtPassword.sendKeys(password);
    }

    @Step("Hacer click en el boton login")
    public void clickLogin(){
        btnLogin.click();
    }
}
