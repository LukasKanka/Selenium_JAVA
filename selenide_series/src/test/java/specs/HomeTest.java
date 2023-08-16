package specs;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.AssertJUnit.assertEquals;

public class HomeTest {
    @Test
    public void testPageUrlAndTitle() {
        open("https://practice.sdetunicorns.com/");

        // test očekávané url, String url do této proměné jsme vložily url
        String url = WebDriverRunner.url();
        assertEquals(url, "https://practice.sdetunicorns.com/");

        // test titulu stránky
        String title = title();
        assertEquals(title, "Practice E-Commerce Site – SDET Unicorns – Helping you succeed in Software Quality.");
    }

    @Test
    public void testInteractingWithElements() {
    }
}

