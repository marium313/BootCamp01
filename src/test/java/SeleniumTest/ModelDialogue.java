package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class ModelDialogue {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/modal-dialogs");
    }

    @Test
    public void testModelDialogue() {
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement moddalButton = driver.findElement(By.id("showSmallModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",moddalButton);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showSmallModal\"]")));
        moddalButton.click();

        WebElement smallModalTextElement = driver.findElement(By.className("modal-body"));
        String smallModalText = smallModalTextElement.getText();
        System.out.println(smallModalText);
        String modalText = "This is a small modal. It has very less content";

        Assert.assertEquals(smallModalText,modalText,"Not Same");
        driver.findElement(By.id("closeSmallModal")).click();
    }

    @Test
    public void testLargeModal() {

        WebElement LargeModal = driver.findElement(By.id("showLargeModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",LargeModal);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showLargeModal\"]")));
        LargeModal.click();

        WebElement largeModalTextElement = driver.findElement(By.className("modal-body"));
        String largeModalText = largeModalTextElement.getText();
        System.out.println("Large Modal Text: " + largeModalText);

        String modalText = "Lorem Ipsum is simply ";
        Assert.assertTrue(largeModalText.contains(modalText));

        driver.findElement(By.id("closeLargeModal")).click();
    }



    @AfterClass
    public void cleanUp(){
        if (driver != null){
            driver.quit();
        }
    }

}