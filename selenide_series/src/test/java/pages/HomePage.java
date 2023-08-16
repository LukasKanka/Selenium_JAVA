package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;

public class HomePage {
    public HomePage open() {
        Selenide.open("https://practice.sdetunicorns.com/");
        return this;
    }
    // pomocí ALT+Enter si vytvoříme v červeném (jako importy) řádku com.codeborne.selenide.SelenideElement
    // pak s toho vytvoříme import com.codeborne.selenide.SelenideElement;
    //pak mužeme odmazat níže část s com.codeborne.selenide.
    public SelenideElement getStaredBtn() {
        return $(By.id("get-started"));
    }
    public SelenideElement headingTitle() {
        return  $("h1");
    }
    public SelenideElement logoLink() {
        return $(By.xpath("//*[@id=\"zak-masthead\"]/div/div/div/div[1]/div/a/img"));
    }
   //zde vracíme kolekci elementu tak proto ElementsCollection
    public ElementsCollection linksList() {
        return $$("#zak-primary-menu li[id*=menu-item]");
    }

    public void assertUrl(String expectedURL) {
        String url = WebDriverRunner.url();
        assertEquals(url, expectedURL);
    }

}

