package com.javaAT.stepdefinitions;

import com.javaAT.driver.DriverFactory;
import com.javaAT.pages.PageFactory;
import com.javaAT.pages.LoginPage;
import com.javaAT.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.time.Duration;

public class LoginStepDef {

    private LoginPage loginPage;
    private HomePage homePage;

    @Given("Browser should open")
    public void browserOpen(){
        loginPage = PageFactory.getLoginPage();
    }

    @Given("user in on the login page")
    public void loginPage(){
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not displayed");
    }

    @When("user enter username {string}")
    public void userEnterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("password {string}")
    public void password(String password) {
        loginPage.enterPassword(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginPage.clickLoginButton();
        // Wait for page to load after login
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("app_logo")));
    }

    @Then("user should be on the HomePage")
    public void userShouldBeOnTheHomePage() {
        homePage = PageFactory.getHomePage();
        Assert.assertTrue(homePage.isLogoVisible(), "User is not on home page");
    }
}
