package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void confirmAlertTest(){
        var alertTest = homePage.clickJsAlert();
        alertTest.triggerAlert();
        alertTest.acceptAlert();
        assertEquals(alertTest.getResult(), "You successfully clicked an alert", "The message" +
                "does not match");
    }
}
