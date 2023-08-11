import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/kalkulacka.php");
        // id
        driver.findElement(By.cssSelector("button#count")).click();
        // class - trida
        driver.findElement(By.cssSelector("button.btn-success")).click();

        driver.get(BASE_URL + "/clickmebaby.php");
        // tlačítko je v poli container a v něm je button
        driver.findElement(By.cssSelector("div.container button")).click();



    }
    @After
    public void tearDown(){
        // driver.quit();

    }
}
