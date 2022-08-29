package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    By emailField = By.id("email");
    By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailPage clickRetrievePassword(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailPage(driver);
    }
}
