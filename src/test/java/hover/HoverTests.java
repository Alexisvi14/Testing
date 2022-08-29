package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoversPage();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption incorrect");
        assertEquals(caption.getLinkText(),"name: user1\n" +
                "View profile", "Incorrect link");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
