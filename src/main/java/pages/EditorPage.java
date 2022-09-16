package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentionButton = By.xpath("//button[@title='Increase indent']");

    public EditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearText(){
        clickEditArea();
        driver.findElement(textArea).clear();
        returnToMainArea();
    }

    public void setText(String text){
        clickEditArea();
        driver.findElement(textArea).sendKeys(text);
        returnToMainArea();
    }
    public void clickEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void returnToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clickIncreaseIndent(){
        driver.findElement(increaseIndentionButton);
    }

    public String getTextFromEditor(){
        clickEditArea();
        String text = driver.findElement(textArea).getText();
        return text;
    }
}
