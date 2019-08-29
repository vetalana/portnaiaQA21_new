package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void logInTest(){
        driver.get("https://ebay.com");
        //init login
        click(By.id("gh-ug"));// klikaem na slova "sign in"

        //fill in login form
        click(By.id("userid")); // klikaem na slova "email or username"
        driver.findElement(By.id("userid")).clear();// ochischaem eto pole,esli tam chto-to bilo
        driver.findElement(By.id("userid")).sendKeys("abs@gmail.com");// zapolneaem pole

        click(By.id("pass")); // klikaem na slova "password"
        driver.findElement(By.id("pass")).clear();// ochischaem eto pole,esli tam chto-to bilo
        driver.findElement(By.id("pass")).sendKeys("123456789");// zapolneaem pole

        click(By.id("sgnBt"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}