package com.javaAT.hooks;

import com.javaAT.config.ConfigReader;
import com.javaAT.driver.DriverFactory;
import com.javaAT.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.initDriver(
                ConfigReader.get("browser"));

        DriverFactory.getDriver()
                .get(ConfigReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
                // Also save to file for external reports
                ScreenshotUtil.captureScreenshot(DriverFactory.getDriver(), scenario.getName().replaceAll(" ", "_"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DriverFactory.quitDriver();
    }
}