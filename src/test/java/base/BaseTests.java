package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/alexisvillamayor/Solvd/Dev/chromedriver");
        driver = new ChromeDriver();
        goHome();
        //Instantiating HomePage
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
