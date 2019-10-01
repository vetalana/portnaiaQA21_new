package wikitestsprogressive.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{


    public SessionHelper(WebDriver driver) {
        super(driver);

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


