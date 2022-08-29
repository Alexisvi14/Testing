package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    By triggerAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    By result = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
