package cz.lukan;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MercuryLoginTest {
    @Test
    public void testMercuryLogin() {
        Configuration.browser="chrome";
        Configuration.browserSize="1000x650";
        Configuration.headless=true;
        Configuration.screenshots=true;
        Configuration.timeout=13000;
        Configuration.holdBrowserOpen=true;
        open("https://www.demo.guru99.com/test/newtours/");
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        switchTo().frame(3);
        $("#save > .mat-button-wrapper span").click();
        $(By.name("userName")).setValue("test");
        $(By.name("password")).setValue("test");
        $(By.name("submit")).click();
        $("h3").shouldHave(text("Login Successfully"));
    }
}
