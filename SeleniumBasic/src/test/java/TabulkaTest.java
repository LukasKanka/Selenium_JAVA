import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
