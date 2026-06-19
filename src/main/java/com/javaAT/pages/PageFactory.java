package com.javaAT.pages;

import com.javaAT.driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class PageFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public PageFactory() {
        driver.set(DriverFactory.getDriver());
    }

    public static LoginPage getLoginPage() {
        return new LoginPage();
    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void clearDriver() {
        driver.remove();
    }
}
