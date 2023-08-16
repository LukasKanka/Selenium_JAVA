package specs;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
// pro každou novou funkci pomocí AlT + Enter můžeme přidat hvězdičku a ušetříme řádky
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HomeTest {
   HomePage home = new HomePage();
    @Test
    public void testPageUrlAndTitle() {
        // home page z page objects
        home
                .open()   // můžeme i řetězit
                        .assertUrl("https://practice.sdetunicorns.com/");


        // test očekávané url, String url do této proměné jsme vložily url
        // *page*
       // home.assertUrl("https://practice.sdetunicorns.com/");

        // test titulu stránky
        String title = title();
        assertEquals(title, "Practice E-Commerce Site – SDET Unicorns – Helping you succeed in Software Quality.");
    }

    @Test
    public void testInteractingWithElements() {
         open("https://practice.sdetunicorns.com/");

         // klikneme na tlačítko podle id * page_object *
        home.getStaredBtn().click();

        // zkontrolujeme očekávanou URL máme dva způsoby
        String url = WebDriverRunner.url();
        //assertEquals(url, "https://practice.sdetunicorns.com/#get-started");
        assertTrue(url.contains("get-started"));

        // najdeme objeckt podle cssSelector a zkontrolujeme jeho text ( zde je to třída h1 class )
        // *pages object
        home.headingTitle()
                .should(text("Think different. Make different."));

        // Ověříme logo pomocí xpath * pages*
        home.logoLink()
                .should(be(visible));
    }

    @Test
    public void testMultipleElements() {
        open("https://practice.sdetunicorns.com/");

        // zkontrolujeme názvy v menu (horní lišta)
        // $$ znamená že pracujeme s více elementy
        // vytvoříme si pak proměnou linklists
        //za li[id. . .] už je id na položky v menu
        List<String> expectedLinks = List.of("Home", "About", "Shop", "Blog", "Contact", "My account");
        ElementsCollection linkLists = home.linksList();

        // vypíšeme do console položky menu
        System.out.println(linkLists.texts());

        //porovnáme výsledek z našimy zadanými hodnoty na začátku testu
        List<String> linkListsText = linkLists.texts();
        assertEquals(linkListsText, expectedLinks);
        // a kratší způsob zápisu
        linkLists.shouldHave(CollectionCondition.texts(expectedLinks));
    }
}

 

