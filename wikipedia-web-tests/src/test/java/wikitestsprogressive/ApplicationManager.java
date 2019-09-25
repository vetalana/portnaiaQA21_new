package wikitestsprogressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        //add default waiting for WebElement
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open site
        driver.get("https://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
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

    public void typeRequest(String request) {
        type(By.name("search"), request);
    }

    public void clickGoButton() {
        click(By.name("go"));
    }

    public String getArticleTitle() {
        return driver.findElement(By.cssSelector("h1#firstHeading")).getText();
    }
}
