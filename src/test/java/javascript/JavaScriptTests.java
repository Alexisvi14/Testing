package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void scrollToTableTest(){
        homePage.clickLargePage().scrollToTable();
    }

    @Test
    public void scrollInfiniteTest(){
        homePage.clickInfinitePage().scrollToParagraph(5);
    }
}
