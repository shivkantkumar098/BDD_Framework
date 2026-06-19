package com.javaAT.listners;

import com.javaAT.utils.ScreenshotUtil;
import com.javaAT.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = DriverFactory.getDriver();

        try {
            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());
            // Attach screenshot to TestNG report (link and inline image)
            Reporter.log("<br><a href='" + screenshotPath + "' target='_blank'>Screenshot</a><br>");
            Reporter.log("<br><img src='" + screenshotPath + "' height='400' width='400'/><br>");
        } catch (IOException e) {
            Reporter.log("Failed to capture screenshot: " + e.getMessage());
        }

        // additional reporting integrations (Allure/Extent) can be added here
    }
}