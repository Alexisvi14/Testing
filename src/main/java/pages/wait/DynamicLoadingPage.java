package pages.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;
    By linkExample1 = By.xpath("//a[@href=\"/dynamic_loading/1\"]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new Example1Page(driver);
    }


}
