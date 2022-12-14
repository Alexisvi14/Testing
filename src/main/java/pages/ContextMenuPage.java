package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    WebDriver driver;
    By square = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickInSquare(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(square)).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }
}
