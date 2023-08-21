package cz.lukan;

import com.microsoft.playwright.*;

public class cookiesPlaywright {
     public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://lukan.cz/");
                    page.getByText("Accept").click();

        }
}
    }
