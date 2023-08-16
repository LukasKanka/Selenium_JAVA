package test;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class cookies {
    // Shared between all tests in this class.
    static Playwright playwright;
    static Browser browser;

    // New instance for each test method.
    BrowserContext context;
    Page page;


    @BeforeEach
    public void setUp() {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
        BrowserContext context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    public void tearDown() {
        page.close();
        page.context().close();
        page.close();
    }

    @Test
    void Accept() {
        page.navigate("https://lukan.cz");
        page.getByText( "Accept").click();
    }
    @Test
    void Decline() {
        page.navigate("https://lukan.cz");
        page.getByText("Decline").click();
    }

}
