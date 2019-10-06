package wikitestsprogressive.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchWikiTests extends  TestBase {


    @Test(priority=2)
    public void searchWikiTest1(){
        app.getArticleHelper().typeRequest("Radiation");
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), "Radiation".toLowerCase());
    }


    @Test (priority=1)
    public void searchWikiTest2(){
        app.getArticleHelper().typeRequest("Calendar");
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), "Calendar".toLowerCase());
    }


}

