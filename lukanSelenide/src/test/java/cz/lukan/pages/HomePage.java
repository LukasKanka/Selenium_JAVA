package cz.lukan.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;

public class HomePage {
    public HomePage open() {
        Selenide.open("https://lukan.cz");
        return this;
    }
    public HomePage titulek() {
         String title = title();
        assertEquals(title, "Lukáš bloguje - Blog o všem možném i nemožném");
        return this;
    }
    public SelenideElement getAcceptClick() {return $(By.className("eu-cookies-bar-tick"));}

    public SelenideElement getDeclineClick() {return $(By.className("eu-cookies-bar-decline"));}


}
