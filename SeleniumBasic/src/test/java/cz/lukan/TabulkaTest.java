package cz.lukan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TabulkaTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/tabulka.php");
        // video 31
        driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText();
        // vide 32
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows);
        for (WebElement roow : rows) {
            System.out.println(roow.getText());

        }

    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
