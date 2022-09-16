package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void navigationTest(){
        homePage.clickDynamicPage().clickExample1();
        getWindowsManager().goBack();
        getWindowsManager().refresh();
        getWindowsManager().goTo("https://www.google.com");
    }

    @Test
    public void switchTabsTest(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowsManager().switchToTab("New Window");
    }
}
