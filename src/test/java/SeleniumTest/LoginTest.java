package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){

        switch(browser.toLowerCase()){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "chrome":


            default:
                System.out.println("No browser found");
                break;
    }
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void login() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String PageTitle = driver.getTitle();

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";

        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match");


    }

    @Test(dependsOnMethods = "login", priority = 1)
    public void positiveTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String PageTitle = driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Username =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        Username.click();
        Username.sendKeys("Admin");
        Password.click();
        Password.sendKeys("admin123");
        Password.sendKeys(Keys.ENTER);

        WebElement picture = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));

        Assert.assertTrue(picture.isDisplayed());


    }

    @Test(dependsOnMethods = "login", priority = 2)
    public void negativeTest1() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String PageTitle = driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Username =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        Username.click();
        Username.sendKeys("");
        Password.click();
        Password.sendKeys("admin123");
        Password.sendKeys(Keys.ENTER);

        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));

        String actualText = message.getText();

        String expectedText = "Required";
        Assert.assertEquals(actualText, expectedText, "Does not match");
    }

    @Test(dependsOnMethods = "login", priority = 3)
    public void negativeTest2() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String PageTitle = driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Username =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        Username.click();
        Username.sendKeys("Admin");
        Password.click();
        Password.sendKeys("");
        Password.sendKeys(Keys.ENTER);

        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));

        String actualText = message.getText();

        String expectedText = "Required";
        Assert.assertEquals(actualText, expectedText, "Does not match");
    }

    @Test(dependsOnMethods = "login", priority = 4)
    public void negativeTest3() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String PageTitle = driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Username =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

        WebElement Password =
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        Username.click();
        Username.sendKeys("");
        Password.click();
        Password.sendKeys("");
        Password.sendKeys(Keys.ENTER);

        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));

        WebElement message2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));

        String actualText = message.getText();
        String actualText2 = message.getText();

        String expectedText = "Required";
        Assert.assertEquals(actualText, expectedText, "Does not match");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
