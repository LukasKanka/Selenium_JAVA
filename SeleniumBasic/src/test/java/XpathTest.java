import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/tabulka.php");
        driver.findElement(By.xpath("/html/body/div/div/table/thead/tr"));

    }
    @After
    public void tearDown(){
        // driver.quit();

    }
}
