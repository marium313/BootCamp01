package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class EmailTest {
    WebDriver driver;

    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void YahooLogin() {
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2Fonboarding");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Yahoo";

        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match");

    }

    @Test(dependsOnMethods = "YahooLogin", priority = 1)
    public void Test() {
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2Fonboarding");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Username =
                driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
        Username.click();
        Username.sendKeys("mariumh12");
        Username.sendKeys(Keys.ENTER);

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"login-passwd\"]"));
        Password.click();
        Password.sendKeys("Automation123");
        Password.sendKeys(Keys.ENTER);

        WebElement Compose =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[1]/a"));
        Compose.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement To =
                driver.findElement(By.xpath("//*//*[@id=\"message-to-field\"]"));
        To.click();
        To.sendKeys("harsh@collaboraitinc.com");

        WebElement Subject =
                driver.findElement(By.xpath("//*[@id=\"compose-subject-input\"]"));
        Subject.click();
        Subject.sendKeys("Test Email");

        WebElement TextBox =
                driver.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]"));
        TextBox.click();
        TextBox.sendKeys("Hello this is an automated email sent through selenium");
        TextBox.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/button")).click();


    }

    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}
