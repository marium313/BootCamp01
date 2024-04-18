package CucumberTestingSlackDemo;

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

public class SlackTest {
    WebDriver driver;

    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void SlackLogin() {
        driver.get("https://slack.com/workspace-signin");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Find your workspace | Slack";

        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match");

    }

    @Test(dependsOnMethods = "SlackLogin", priority = 1)
    public void Test() {
        driver.get("https://slack.com/workspace-signin");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement URL =
                driver.findElement(By.xpath("//*[@id=\"domain\"]"));
        URL.click();
        URL.sendKeys("https://creativecodingcollect");
        URL.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"page_contents\"]/div/div/div[2]/div[3]/div[4]/span/a")).click();

        WebElement Email =
                driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Email.click();
        Email.sendKeys("mariumh12@gmail.com");

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password.click();
        Password.sendKeys("Chickybeebz1");

        WebElement SignInButton =
                driver.findElement(By.xpath("//*[@id=\"signin_btn\"]"));
        SignInButton.click();

        WebElement Search =
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div"));
        Search.click();
        driver.findElement(By.xpath("//*[@id=\"c-search_autcomplete__suggestion_2\"]/div[1]/div/div/div/span/span/span/span[2]/b")).click();

        driver.findElement(By.xpath("//*[@id=\"people\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"people_78da9c29-36f2-4b4c-a2f8-4dac831e2a05\"]/div/div[1]/div/div")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div[6]/div/button[1]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Message =
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]/div/div/div/div[3]/div/div[3]/div"));
        Message.click();
        Message.sendKeys("Hello this is an automated slack message");
        Message.sendKeys(Keys.ENTER);

    }

    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}

