package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider();
        horizontalSliderPage.moveSlider(3);
        horizontalSliderPage.getResult();
        Assert.assertEquals(horizontalSliderPage.getResult(), "4", "Error");
    }
}
