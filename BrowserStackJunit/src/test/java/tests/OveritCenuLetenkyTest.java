package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OveritCenuLetenkyTest {
    @Test
    void OverimeCenuLetenky() {
        // jdeme na web kiwi
        open("https://www.kiwi.com/cz/");
        // potvrdíme cooki
        $(byXpath("//*[@id=\"cookies_accept\"]")).click();
        // kliknu na hlavni strane na prozkoumat
        $(byAttribute("data-test" ,"LandingSearchButton")).click();
        // kliknu na prvni nabídku na strance
        $(byAttribute("data-test" ,"PictureCardContent")).click();
        // pockam na nactení letenek
        // ulozim si cenu letenky do promenne
        // otevrem detail letenky a porovnam cenu


    }
}
