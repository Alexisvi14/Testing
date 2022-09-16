package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

public class BaseTests {

    WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/alexisvillamayor/Solvd/Dev/chromedriver");
        driver = new ChromeDriver();
        goHome();
        //Instantiating HomePage
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WindowsManager getWindowsManager() {
        return new WindowsManager(driver);
    }

//      This method can be used when you want to take a screenshot a failed test.

//    @AfterMethod
//    public void recordFailure(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            var camera = (TakesScreenshot) driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot, new File("/resources/screenshots/" + result.getName() + ".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
//      It can be used when you want to take a screenshot everytime you make a test run.

//    @AfterMethod
//    public void takeScreenshot(){
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        try {
//            Files.move(screenshot, new File("/resources/screenshots/" + result.getName() + ".png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

