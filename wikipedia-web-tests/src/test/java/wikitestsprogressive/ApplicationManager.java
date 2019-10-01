package wikitestsprogressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.SessionLogHandler;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    WebDriver driver;
    ArticleHelper articleHelper;
    SessionHelper sessionHelper;


    public void init() {
        driver = new ChromeDriver();
        //add default waiting for WebElement
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open site
        sessionHelper=new SessionHelper(driver);
        driver.get("https://en.wikipedia.org");
        articleHelper=new ArticleHelper(driver);
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ArticleHelper getArticleHelper() {
        return articleHelper;
    }
}
