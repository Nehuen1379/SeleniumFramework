package com.seleniumframework.ar;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.seleniumframework.ar.definitions",
        tags = "@Prueba"
)
public class Runner {
}
