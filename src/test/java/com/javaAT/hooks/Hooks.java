package com.javaAT.hooks;

import com.javaAT.config.ConfigReader;
import com.javaAT.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.initDriver(
                ConfigReader.get("browser"));

        DriverFactory.getDriver()
                .get(ConfigReader.get("url"));
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}