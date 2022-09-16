package alert;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.*;
import static org.testng.Assert.assertEquals;

public class PopUpTest extends BaseTests {

    WebDriver driver;
    @Test
    public void acceptPopUpTest() throws InterruptedException {
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rightClickInSquare();
        String message = contextMenuPage.getPopUpText();
        sleep(1000);
        contextMenuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Incorrect message");
    }
}
