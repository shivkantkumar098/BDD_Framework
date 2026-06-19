package com.javaAT.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getBrowser(Browser browser) {

        switch (browser) {

            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                return new ChromeDriver(chromeOptions);

            case EDGE:
                return new EdgeDriver();

            case FIREFOX:
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Invalid Browser");
        }
    }
}