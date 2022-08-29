package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    WebDriver driver;
    By result = By.tagName("span");
    By sliderTarget = By.xpath("//*[@id=\"content\"]/div/div/input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(sliderTarget).click();
    }
    public void moveSlider(int entry){
        WebElement dot = driver.findElement(sliderTarget);
        for (int i = 0; i < entry; i ++){
            dot.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
