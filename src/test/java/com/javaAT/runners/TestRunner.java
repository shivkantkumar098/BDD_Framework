package com.javaAT.runners;

import com.google.common.graph.AbstractNetwork;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"rev.project.stepDefinitions", "rev.project.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
// use of AbstractTestNGCucumberTests: run each cucumber scenario found in the features as separated test.
}
