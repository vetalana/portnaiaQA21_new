package wikitestsprogressive;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchWikiTests extends  TestBase {


    @Test(priority=2)
    public void searchWikiTestJava(){
        app.typeRequest("radiation");
        app.clickGoButton();
        Assert.assertEquals(app.getArticleTitle().toLowerCase(), "radiation".toLowerCase());
    }


    @Test (priority=1)
    public void searchWikiTestQA(){
        app.typeRequest("calendar");
        app.clickGoButton();
        Assert.assertEquals(app.getArticleTitle().toLowerCase(), "calendar".toLowerCase());
    }


}

