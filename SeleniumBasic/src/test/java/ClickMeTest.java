import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMeTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/clickmebaby.php");
        // message jsem udělal do getText vložit "" vyjmout --> vlažit kam chci psát
        Assert.assertEquals("Inicaálizovaný počet kliků", "0", driver.findElement(By.id("clicks")).getText());
        // for cyklus zvyšování plus 1
        for (int i = 1; i <11 ; i++) {
            driver.findElement(By.id("clickMe")).click();
            Assert.assertEquals(String.valueOf(i),driver.findElement(By.id("clicks")).getText());
            if (i==1){
                System.out.println("ověřujem slovo klik");
                Assert.assertEquals("klik",driver.findElement(By.className("desription")).getText());
            }
            // dálší info video 28

        }
    }
    @After
    public void tearDown(){
         driver.quit();

    }
}
