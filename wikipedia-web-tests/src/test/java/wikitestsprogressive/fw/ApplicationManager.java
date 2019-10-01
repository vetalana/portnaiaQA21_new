package wikitestsprogressive.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    WebDriver driver;
    ArticleHelper articleHelper;
    SessionHelper sessionHelper;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public void init()  {
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
       }
//        else if(browser.equals(BrowserType.EDGE)){
//            driver=new EdgeDriver();
//        }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            sessionHelper = new SessionHelper(driver);
            driver.get("https://en.wikipedia.org");
            articleHelper = new ArticleHelper(driver);
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
