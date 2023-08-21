package cz.lukan;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class klikacka {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://lukan.cz/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("O mně")).click();
            page.getByText("Accept").click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Zásady ochrany osobních údajů")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Úvodní stránka")).click();
            page.locator("//*[@id=\"post-1225\"]/header/div/h2/a").click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Úvodní stránka")).click();
        }
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
