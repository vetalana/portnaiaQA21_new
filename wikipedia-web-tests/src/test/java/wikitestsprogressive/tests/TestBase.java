package wikitestsprogressive.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import wikitestsprogressive.fw.ApplicationManager;


public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public  void setUp(){
        app.init();
    }


    @AfterSuite
    public void tearDown() throws InterruptedException {
        app.stop();
    }


}


