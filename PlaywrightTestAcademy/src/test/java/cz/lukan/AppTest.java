package cz.lukan;


import com.microsoft.playwright.*;

public class AppTest {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title() + " " + "Test is OK!");
        }
    }
}