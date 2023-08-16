package specs;

import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UploadTest {
    @Test
    public void testUploadFileOnVisibleInput() {
        open("https://the-internet.herokuapp.com/upload");
        // upload file
        $("#file-upload").uploadFile(new File("src/test/data/sample.png"));
        // click upload button
        $("#file-submit").click();
        // verify successful text
        $("h3").shouldHave(text("File Uploaded!"));
    }

    @Test
    public void testUploadFileOnHiddenInput() {
        open("https://practice.sdetunicorns.com/cart/");
        // https://www.youtube.com/watch?v=MA8QC4Eoaps&list=PL6AdzyjjD5HC4NJuc083bzFq86JekmASF&index=6
        // dodělat můžu zkusit u svůj způsob bez toho mazání tam
        // upload file

    }
}
