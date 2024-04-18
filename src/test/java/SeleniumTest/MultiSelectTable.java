package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

import java.time.Duration;

public class MultiSelectTable {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/selectable");

    }

    @Test
    public void testMultiSelect(){
        List<WebElement> items = driver.findElements(By.xpath("//li[contains(@class,'list-group-item')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,400);");


        items.get(0).click();
        items.get(2).click();
        items.get(3).click();

        String expectedColorAfterClick = "rgba(0, 123, 255, 1)";
        Assert.assertEquals(items.get(0).getCssValue("background-color"),expectedColorAfterClick);
        Assert.assertEquals(items.get(2).getCssValue("background-color"),expectedColorAfterClick);
        Assert.assertEquals(items.get(3).getCssValue("background-color"),expectedColorAfterClick);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
