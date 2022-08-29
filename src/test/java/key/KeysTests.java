package key;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
        var keyPresses = homePage.clickKeyPresses();
        keyPresses.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPresses.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testWriteAlexis(){
        var keyPresses = homePage.clickKeyPresses();
        keyPresses.enterText("Alexis");
        assertEquals(keyPresses.getResult(), "You entered: S", "The message is incorrect");
    }
}
