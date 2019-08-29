package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();// ochischaem eto pole,esli tam chto-to bilo
        driver.findElement(locator).sendKeys(text);// zapolneaem pole
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickLoginButton() {
        click(By.id("sgnBt"));
    }

    public void fillInLoginForm(String email, String pswd) {
        type(By.id("userid"), email);
        type(By.id("pass"), pswd);
    }

    public void initLogin() {
        click(By.id("gh-ug"));
    }
}
