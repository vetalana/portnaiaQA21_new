package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay1 extends TestBase {
    @Test
    public void logInTest(){
        openSite("https://ebay.com");
        initLogin();
        fillInLoginForm("qwe@dd.gmail.com", "123456789");
        clickLoginButton();
    }


}