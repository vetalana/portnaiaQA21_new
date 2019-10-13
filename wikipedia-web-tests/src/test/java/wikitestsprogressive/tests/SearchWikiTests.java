package wikitestsprogressive.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class SearchWikiTests extends TestBase {

    Logger logger = LoggerFactory.getLogger(SearchWikiTests.class);
    @DataProvider
    public Iterator<Object[]> searchWords() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Radiation"});
        list.add(new Object[]{"Calendar"});
        return list.iterator();
    }

    @BeforeMethod
    public void startLogger(Method m, Object[]p) {
        logger.info("start test " + m.getName() + " with parameters " + Arrays.asList(p));
    }

    @AfterMethod
    public void stopLogger(Method m, Object[]p) {
        logger.info("stop test " + m.getName() + " with parameters " + Arrays.asList(p));
        System.out.println("==================================================");
    }

    @Test(dataProvider = "searchWords")
    public void searchWikiTestwithDataProvider(String searchWord) {
        app.getArticleHelper().typeRequest(searchWord);
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), searchWord.toLowerCase());
    }


    @Test(enabled = false, priority = 2)
    public void searchWikiTest1() {
        String searchWord = "Radiation";
        app.getArticleHelper().typeRequest(searchWord);
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), searchWord.toLowerCase());
    }


    @Test(enabled = false, priority = 1)
    public void searchWikiTest2() {
        app.getArticleHelper().typeRequest("Calendar");
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), "Calendar".toLowerCase());
    }


}

