package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void waitTillHidden(){
        var example1Page = homePage.clickDynamicPage().clickExample1();
        example1Page.clickStartButton();
        assertEquals(example1Page.getLoadedText(), "Hello World!",
                "The message is incorrect");

    }
}
