package cz.lukan;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.nio.file.Paths;


public class cookies {
    Page page;

    @BeforeEach
    public void setUp() {


    }

   @AfterEach
    public void tearDown() {
        page.close();
        page.context().close();

    }


    @Test
    void Accept() {
        Playwright playwright = Playwright.create();
          Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://lukan.cz");
        page.getByText( "Accept").click();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
    }
    @Test
    void Decline() {
        Playwright playwright = Playwright.create();
          Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://lukan.cz");
        page.getByText("Decline").click();
    }

}
