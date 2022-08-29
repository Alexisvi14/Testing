package password;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailPage;
import pages.ForgotPasswordPage;

public class PasswordTests extends BaseTests {
    @Test
    public void retrievePasswordTest(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmailField("alexisvi@example.com");
        EmailPage emailPage = forgotPasswordPage.clickRetrievePassword();
        Assert.assertEquals(emailPage.getErrorAlert(), "Internal Server Error",
                "The message is incorrect");
    }
}
