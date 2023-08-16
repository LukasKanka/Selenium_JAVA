package cz.lukan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    // video 33 výpis do konzole textu
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL);


    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
