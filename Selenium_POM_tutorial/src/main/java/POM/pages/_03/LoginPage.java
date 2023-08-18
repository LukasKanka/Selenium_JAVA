package POM.pages._03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // Webdriver potřebujeme abych mohl vyplňovat pomocí funkce fill
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    // pole na vyplnění user name password,identifikace polde id
    private final By textbox_username = By.id("user-name");
    private final By textbox_password = By.name("password");
    private final By btn_login = By.xpath("//*[@id=\"login-button\"]");

    // Vyplnění údajů
    public void fill_Textbox_username(String username) {
        driver.findElement(textbox_username).sendKeys(username);
    }
    public void fill_Textbox_password(String password) {
        driver.findElement(textbox_password).sendKeys(password);
    }
    public void click_Btn_Login() {
        driver.findElement(btn_login).click();
    }


}
