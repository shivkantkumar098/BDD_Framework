package com.javaAT.runners;

import com.google.common.graph.AbstractNetwork;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.javaAT.stepdefinitions", "com.javaAT.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
// use of AbstractTestNGCucumberTests: run each cucumber scenario found in the features as separated test.
}
