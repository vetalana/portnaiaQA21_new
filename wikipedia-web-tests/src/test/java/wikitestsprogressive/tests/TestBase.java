package wikitestsprogressive.tests;

import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import wikitestsprogressive.fw.ApplicationManager;

import java.lang.reflect.Method;
import java.util.Arrays;


public class TestBase {
//    Logger logger = LoggerFactory.getLogger(TestBase.class);
//
//    @BeforeMethod
//    public void startLogger(Method m, Object[]p){
//        logger.info("start test "+ m.getName() + " with parameters " + Arrays.asList(p) );
//    }
//
//    @AfterMethod
//    public void stopLogger(Method m, Object[]p){
//        logger.info("stop test " + m.getName() + " with parameters " + Arrays.asList(p) );
//        System.out.println("==================================================");
//    }

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


