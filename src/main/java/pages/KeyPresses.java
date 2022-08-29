package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    WebDriver driver;
    private By inputText = By.id("target");
    private By result = By.id("result");

    public KeyPresses(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputText).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
