package com.telran.selenium1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiLogIn extends TestBase{
    @Test(enabled = false)
    public void wikiLogInTest(){
        driver.get("https://en.wikipedia.org");

        driver.findElement(By.id("pt-login")).click();

        driver.findElement(By.id("wpName1")).click();
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("qwerty");

        driver.findElement(By.id("wpPassword1")).click();
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("Aa123456789");

        driver.findElement(By.id("wpLoginAttempt")).click();



    }

}
