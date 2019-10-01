package wikitestsprogressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {

        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void confirmLogin() {
        click(By.name("wploginattempt"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("wpName1"), email);
        type(By.id("wpPassword1"), password);
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }
}
