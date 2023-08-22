package cz.lukan;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LaunchBrowser {



    @Test
    public void testBrowser() {
        // System.setProperty("webdriver.gecko.driver", "C:\\Users\\lukas\\Nextcloud\\GitHub\\Java\\Selenium_Selenide_Playwright_JAVA\\Selenite_Naveen\\driver\\geckodriver.exe");
        // Configuration.browser = "firefox";
        //Configuration.startMaximized = tru;
        Configuration.headless = true; // true nezobrazí browser
        Configuration.baseUrl = "https://www.google.com/";
        Configuration.screenshots = false;

        open("/");
        // Odmítnutí cookie
        $ (By.id("W0wltc")).click();
    }
}
