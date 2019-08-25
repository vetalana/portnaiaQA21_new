package com.telran.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
