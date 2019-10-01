package wikitestsprogressive.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import wikitestsprogressive.fw.ApplicationManager;


public class TestBase {
    protected static ApplicationManager app = new ApplicationManager
            (System.getProperty("browser",BrowserType.CHROME));
    //protected static ApplicationManager app = new ApplicationManager
            //(System.getProperty("browser",BrowserType.FIREFOX));
    @BeforeSuite
    public  void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        app.stop();
    }


}


