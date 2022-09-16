package pages.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Example1Page {
    WebDriver driver;
    By startButton = By.xpath("//div/button[1]");
    By loadingIndicator = By.id("loading");
    By loadedText = By.id("finish");

    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        //Here I used 2 kinds of waits.

        FluentWait wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

}
