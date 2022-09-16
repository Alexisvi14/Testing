package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiWyg() throws InterruptedException {
        var editorPage = homePage.clickEditorPage();
        editorPage.clearText();

        String text1 = "Hello ";
        String text2 = "World";
        editorPage.setText(text1);
        editorPage.clickIncreaseIndent();
        editorPage.setText(text2);
        sleep(1000);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "The message is incorrect");
    }
}
