package com.javaAT.pages;

import com.javaAT.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "app_logo")
    private WebElement logoHomePage;

    public boolean isLogoVisible(){
        return logoHomePage.isDisplayed();
    }
}
