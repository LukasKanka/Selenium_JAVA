package cz.lukan.stepdefinitions;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LukanStepDefinitions {
    @Given("I navigate to {string}")
public void i_navigate_to(String string) {
        open(string);
        sleep(3000);

}
@Given("I wait for {int} seconds")
public void i_wait_for_seconds(Integer int1) {
        sleep(int1*1000);


}
// Opravit
@Given("Click cookie accept")
public SelenideElement click_cookie_accept() {
         $(By.className("eu-cookies-bar-tick")).click();
    return null;
}


}
