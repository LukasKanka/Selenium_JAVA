package cz.lukan;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {
    @Test
    public void googleSearchTest() {
        open("https://www.google.com/");
        // Odmítnutí cookie
        $ (By.id("W0wltc")).click();
        // Vyhledávaání
        $ (By.name("q")).setValue("Naveen AutomationLabs");
        $ (By.name("btnK")).click();
        // Ověříme že na stránce je logo Google
        $(By.id("logo")).shouldHave(appear);
        // Zkontroluji výsledek hledání na stránce
        String header = $ (By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
        System.out.println(header + " " + "test prošel");
        Assert.assertEquals(header, "Welcome to Naveen AutomationLabs - naveen automationlabs");
        // Zobrazíme počet výsledků Googlem
        int headerCount = $$(By.cssSelector(".LC20lb.DKV0Md")).size();
        System.out.println(headerCount + " " + "počet výsledků");
        // Můžeme ověřit zadaný počet výsledků
        $$(By.cssSelector(".LC20lb.DKV0Md")).shouldHave(CollectionCondition.size(14));
    }
}
