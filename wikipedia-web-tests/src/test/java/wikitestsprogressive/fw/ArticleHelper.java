package wikitestsprogressive.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticleHelper extends HelperBase{
    public ArticleHelper(WebDriver driver) {
        super(driver);
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
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
