package wikitestsprogressive;

import org.testng.annotations.Test;


public class LoginWikiTest extends TestBase {


    @Test
    public void loginTest() {
        app.getSessionHelper().initLogin();
        app.getSessionHelper().fillLoginForm("svetlana.portnaia@gmail.com", "Aa1234556789");
        app.getSessionHelper().confirmLogin();
    }




}

