package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUpload extends BaseTests {

    @Test
    public void fileUploadTest(){
        var fileUploadPage = homePage.clickUploadPage();
        fileUploadPage.uploadFile("/Users/alexisvillamayor/IdeaProjects/testing/src/main/resources/wings.png");
        assertEquals(fileUploadPage.getUploadedFile(), "wings.png", "Uploaded");
    }
}