package cz.lukan;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class SelectTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    private  StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void  setUp()  {
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/vybersi.php");
        new Select(driver.findElement(By.className("form-control"))).selectByIndex(1);
        new Select(driver.findElement(By.className("form-control"))).selectByValue("02");
        new Select(driver.findElement(By.className("form-control"))).selectByVisibleText("Pikachu");
        // výpis textu
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        // kontrola jestli se v textu nalézá Pikachu
        Assert.assertTrue("Pikachu se v textu nenachází", driver.findElement(By.xpath("//div/h3")).getText().contains("Pikachu"));
        // kontrola jestli se nenalézé něco jiného v textu ( v tomto prípadě Gizela)
        Assert.assertFalse(driver.findElement(By.xpath("//div/h3")).getText().contains("Gizela"));
    }
    @After
    public void tearDown(){
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
