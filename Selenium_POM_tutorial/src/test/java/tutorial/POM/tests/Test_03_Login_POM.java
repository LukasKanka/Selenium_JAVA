package tutorial.POM.tests;

import POM.pages._02.HomePage;
import POM.pages._02.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_03_Login_POM {
    WebDriver driver;
   @BeforeMethod
    // open website
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test_Login_Functionality() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fill_Textbox_username("standard_user");
        loginPage.fill_Textbox_password("secret_sauce");
        loginPage.click_Btn_Login();

        HomePage homePage = new HomePage(driver);
        String actual_msg = homePage.get_Msg_footer().getText();
        String expected_msg = " Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";

        Assert.assertTrue(actual_msg.contains(expected_msg));

    }

    // close browser
    @AfterMethod
    public void teardown() {
       driver.quit();
    }


}
