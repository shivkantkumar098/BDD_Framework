package com.javaAT.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getBrowser(Browser browser) {

        switch (browser) {

            case CHROME:
                return new ChromeDriver();

            case EDGE:
                return new EdgeDriver();

            case FIREFOX:
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Invalid Browser");
        }
    }
}