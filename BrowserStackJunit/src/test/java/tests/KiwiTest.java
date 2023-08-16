package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class KiwiTest {
    @Test
    void itShouldOpenMainPage() {
        open("https://www.kiwi.com/en");

        // Cookie (org.openqa.selenium), tento způsob nepůjde na všech webech. Všude to je jinde
        //cookie_consent, agreed --> takto si to pojmenovalo kiwi
        // nakonec za komentovaný způsob nešel použil jsem xpath
        /*
        Cookie cookie = new Cookie("cookie_consent", "agreed");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        //refresh();
         */

        $(byXpath("//*[@id=\"cookies_accept\"]")).click();
        $(byAttribute("data-test" ,"LandingSearchButton")).click();
        System.out.println("");

    }
}
