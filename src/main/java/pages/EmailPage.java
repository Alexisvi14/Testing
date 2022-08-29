package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage {
    WebDriver driver;
    By errorAlert = By.tagName("h1");

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getErrorAlert(){
        return driver.findElement(errorAlert).getText();
    }
}
