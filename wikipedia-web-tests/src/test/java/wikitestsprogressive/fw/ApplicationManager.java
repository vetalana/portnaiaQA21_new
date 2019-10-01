package wikitestsprogressive.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    WebDriver driver;
    ArticleHelper articleHelper;
    SessionHelper sessionHelper;


    public void init() {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

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
