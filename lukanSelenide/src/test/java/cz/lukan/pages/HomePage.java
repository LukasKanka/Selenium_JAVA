package cz.lukan.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public HomePage open() {
        Selenide.open("https://lukan.cz");
        return this;
    }
    public SelenideElement getAcceptClick() {return $(By.className("eu-cookies-bar-tick"));}

    public SelenideElement getDeclineClick() {return $(By.className("eu-cookies-bar-decline"));}


}
