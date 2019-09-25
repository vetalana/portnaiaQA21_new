package wikitestsprogressive;

import org.testng.annotations.Test;


public class LoginWikiTest extends TestBase {


    @Test
    public void loginTest() {
        app.initLogin();
        app.fillLoginForm("svetlana.portnaia@gmail.com", "Aa1234556789");
        app.confirmLogin();
    }




}

