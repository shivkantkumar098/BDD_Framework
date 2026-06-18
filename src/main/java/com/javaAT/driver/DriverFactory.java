package com.javaAT.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browserName) {

        Browser browser = Browser.valueOf(browserName.toUpperCase());

        driver.set(BrowserFactory.getBrowser(browser));

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}