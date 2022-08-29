package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void successfulLogin(){
        LoginPage loginPage = homePage.clickAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getStatusAlert(),
                "You logged into a secure area!\n" +
                        "×",
                "The text is not correct");

    }
}
