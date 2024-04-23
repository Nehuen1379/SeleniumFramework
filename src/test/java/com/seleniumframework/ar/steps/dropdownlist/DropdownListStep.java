package com.seleniumframework.ar.steps.dropdownlist;

import com.seleniumframework.ar.pages.dropdownlist.DropdownPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.ui.Select;

public class DropdownListStep extends DropdownPage {

    @Step("Selecciono la opcion")
    public void selectOption(String option){
        cmbDropdownList.selectByVisibleText(option);
    }
}
