package wikitestsprogressive.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchWikiTests extends  TestBase {


    @Test(priority=2)
    public void searchWikiTest1(){
        app.getArticleHelper().typeRequest("radiation");
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), "radiation".toLowerCase());
    }


    @Test (priority=1)
    public void searchWikiTest2(){
        app.getArticleHelper().typeRequest("calendar");
        app.getArticleHelper().clickGoButton();
        Assert.assertEquals(app.getArticleHelper().getArticleTitle().toLowerCase(), "calendar".toLowerCase());
    }


}

