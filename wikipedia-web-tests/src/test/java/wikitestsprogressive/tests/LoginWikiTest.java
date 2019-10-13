package wikitestsprogressive.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginWikiTest extends TestBase {

    @Test
    public void loginTest() {
        app.getSessionHelper().initLogin();
        app.getSessionHelper().fillLoginForm("svetlana.portnaia@gmail.com", "Aa123456789");
        app.getSessionHelper().confirmLogin();
    }


}

