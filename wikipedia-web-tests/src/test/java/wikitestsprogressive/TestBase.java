package wikitestsprogressive;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


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


