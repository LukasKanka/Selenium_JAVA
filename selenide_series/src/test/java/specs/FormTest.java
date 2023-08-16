package specs;


import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

// zde otestujeme dotazník pro zákazníka který vyplníme.
public class FormTest {
    @Test
    public void testFormFields() {
        open("https://practice.sdetunicorns.com/support-form/");

        // vyplň všechny pole
        $(".support-name input").val("Fanda");
        $(".support-email input").val("Fanda@vidle.com");
        $(".support-subject input").val("Nechce to splachovat");
        // dropdown a checkbox
        $(".support-dropdown select").selectOption("Technical Team");
        $(".support-checkboxes ul li:nth-child(2) input").click();
        // vyber datum
        $(".support-date input").click();
        $(".flatpickr-day.nextMonthDay").click();
        // klikni na Submit tlačítkko
        $("button[type=submit]").click();
        // ověř submit zprávu
        $("div[role=alert]").shouldHave(Condition.text("Thanks for contacting us! We will be in touch with you shortly."));
    }
}
