package tests;

import org.testng.annotations.Test;
import pages.ItemPage;
import pages.TVPage;

import static org.testng.Assert.*;

public class MainTest extends BaseTest{
    @Test
    public void openTVPage() {
        mainPage.open();
        mainPage.clickOnTheButton("Телевизоры");
        mainPage.isPageOpen();
        String TVName = TVPage
        itemPage.clickFirstFromListTV();
        assertEquals(TVName,"");



    }

}
