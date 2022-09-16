package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.javaScript.InfiniteScrollPage;
import pages.javaScript.LargeAndDeepDomPage;
import pages.wait.DynamicLoadingPage;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDownPage(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPage(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversPage(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPresses clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertPage clickJsAlert(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public EditorPage clickEditorPage(){
        clickLink("WYSIWYG Editor");
        return new EditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargePage(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfinitePage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsPage(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
