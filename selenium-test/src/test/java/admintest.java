



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class admintest {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void start() {

        driver =  new ChromeDriver();
        wait = new WebDriverWait(driver,15);

    }

    @Test
    public void admintest() {
        driver.navigate().to("http://localhost/litecart/admin/login.php");
        wait = new WebDriverWait(driver,15);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        wait.until(titleIs("My Store"));

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}