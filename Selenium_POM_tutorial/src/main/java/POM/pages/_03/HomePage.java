package POM.pages._03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
     public HomePage(WebDriver driver){
        this.driver = driver;
    }
    // pole na vyplnění user name password,identifikace polde id
    private final By msg_footer = By.xpath("//*[@id=\"page_wrapper\"]/footer/div");


    // ověríme text footer
    public WebElement get_Msg_footer() {
        return driver.findElement(msg_footer);
    }

}
