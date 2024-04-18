package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void SecondSeleniumTest() throws Exception {

        driver.get("https://www.amazon.com");
        String PageTitle = driver.getTitle();

        Assert.assertEquals(PageTitle, "Amazon.com. Spend less. Smile more.", "Title not match");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("socks");

        searchBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String SockSearch = driver.getTitle();
        String SockSearchResult = "Amazon.com : socks";
        Assert.assertEquals(SockSearch, SockSearchResult, "Title not match");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-main-slot.s-result-list")));

        List<WebElement> productResults = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        int numberOfProducts = productResults.size();

        Assert.assertTrue(numberOfProducts >= 48, "Product count is not greater than zero");

        System.out.println("Number of products found: " + numberOfProducts);

        List<WebElement> productDescription = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

        int countSocks= 0;
        for (WebElement titleElement : productDescription){
            String titleText = titleElement.getText();
        if (titleText.toLowerCase().contains("socks")) {
            countSocks++;
        }
    }

    System.out.println("Number of products with 'Socks' in the title: " + countSocks);

        System.out.println(" ");

        List<WebElement> ProductTitles = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));

        Set<String> uniqueTitles = new HashSet<>();
        for (WebElement ProductTitleElement : ProductTitles){
            String titleText = ProductTitleElement.getText();
            uniqueTitles.add(titleText);
        }

        System.out.println("Unique product titles found: ");
        for (String title : uniqueTitles){
            System.out.println(title);
        }

    }

        @AfterClass
        public void tearDown () {
                driver.quit();
            }
        }




