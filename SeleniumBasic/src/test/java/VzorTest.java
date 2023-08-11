import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VzorTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
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
