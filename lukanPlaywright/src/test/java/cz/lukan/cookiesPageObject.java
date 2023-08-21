package cz.lukan;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import cz.lukan.pages.HomePage;
import org.testng.annotations.Test;

public class cookiesPageObject {
    Page page;
    HomePage homePage;



    @Test
    void Accept() {

        homePage = new HomePage(page);
        Playwright playwright = Playwright.create();
          Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://lukan.cz");
        homePage.clickAcceptCookies();




    }
}
