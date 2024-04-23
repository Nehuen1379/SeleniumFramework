package com.seleniumframework.ar.definitions;

import com.seleniumframework.ar.steps.dropdownlist.DropdownListStep;
import com.seleniumframework.ar.steps.formAuthentication.FormAuthenticationStep;
import com.seleniumframework.ar.steps.validations.ValidationStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class DropdownlistDef {

    @Steps(shared = true)
    ValidationStep vs;

    @Steps(shared = true)
    DropdownListStep dl;

    @When("El usuario selecciona la opción \"([^\"]*)\"$")
    public void userPicksComboBoxOption(String opcion) {
        dl.selectOption(opcion);
    }

    @Then("^La opción seleccionada en el comboBox debería ser \"([^\"]*)\"$")
    public void validateCorrectOption(String opcionSeleccionada) {
        Assert.assertEquals(opcionSeleccionada, vs.selectedOptionIsCorrect());
    }
}
