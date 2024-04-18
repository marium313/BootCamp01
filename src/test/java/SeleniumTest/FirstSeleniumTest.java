package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


/*
1> by ID
2> by name
3> by class name
4> by link text
5> by partial link text
6> by tag name
7> by class selector
 */

/*
*8> Relative X-Path
* 8.1> Absolute X-Path
*
 */

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void FirstTest(){
        driver.get("https://www.google.com"); // opening google.com website.
        String ActualTitle = driver.getTitle(); // getting the title of the page
        String ExpectedTitle = "Google";

        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title not match");
    }

    @Test(dependsOnMethods = "FirstTest" )
    public void SecondTest() {
        driver.findElement(By.name("q")).click(); // searching for the text box on Google and clicking on it to start typing
        driver.findElement(By.name("q")).sendKeys("selenium tutorial for beginners"); //typing the text in the Google search text box
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER); // pressing enter key on keyboard

        String ActualTitle = driver.getTitle(); //getting the title of the page to check what we search is searched by google or not
        String ExpectedTitle = "selenium tutorial for beginners - Google Search";

        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title not match"); // asserting the search

    }

    @Test(dependsOnMethods = "SecondTest" )
    public void ThirdTest() {
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div/div[1]/div/div/span/a")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String companyName = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/p/a")).getText();
        String Expected = "ArtOfTesting";

        Assert.assertEquals(companyName, Expected,"company name not match");

        driver.navigate().back();
        driver.navigate().back();

    }

@AfterClass
public void tearDown() throws Exception {
    if (driver != null) {
//        driver.close();
        driver.quit();
        }
    }
}

// write a script that will take you to amazon.com and search for socks/any other product and count the products
// that are available on the first page and assert that. (JAVA - ARRAY LIST)

// there is a login page write positive and negative test cases and write steps to achieve that.

// 1. positive test case: correct username and correct password
// 2. negative test case: Correct username incorrect password, correct password incorrect username,
//    incorrect username and password