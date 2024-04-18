package CucumberTestingSlackDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class SlackSteps {
    private WebDriver driver;

    @Given("I am on sign in page of Slack")
    public void i_am_on_sign_in_page_of_Slack() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://slack.com/workspace-signin");
    }

    @When("I sign into my workspace")
        public void i_sign_into_my_workspace(){
        WebElement URL =
                driver.findElement(By.xpath("//*[@id=\"domain\"]"));
        URL.click();
        URL.sendKeys("https://creativecodingcollect");
        URL.sendKeys(Keys.ENTER);

        }

    @When("I enter email {string} and {string}")
    public void i_enter_email_and(String email, String password) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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

    }


    @When("I search for Harsh and click message")
    public void i_search_for_Harsh_and_click_message() throws InterruptedException {
        Thread.sleep(7000);

//WebElement Search=
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
//Search.click();
//        Search.sendKeys("HARSH");
//        Search.sendKeys(Keys.ENTER);


        WebElement Search =
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));

        //html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div/button
        //*[@id="search-text"]
        //html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div
        //html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[2]

        Search.click();
        driver.findElement(By.xpath("//*[@id=\"c-search_autcomplete__suggestion_2\"]/div[1]/div/div/div/span/span/span/span[2]/b")).click();
//        Search.sendKeys("Harsh Trevedi");
//        Search.sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"people\"]")).click();

        Thread.sleep(7000);

        driver.findElement(By.xpath("//*[@id=\"people_78da9c29-36f2-4b4c-a2f8-4dac831e2a05\"]/div/div[1]/div/div")).click();

        //*[@id="people_b6ddcb6f-1970-439a-8a40-30ff0250447b"]/div/div[1]/div
        //*[@id="people_b6ddcb6f-1970-439a-8a40-30ff0250447b"]/div/div[1]
        //*[@id="people_b6ddcb6f-1970-439a-8a40-30ff0250447b"]
        //*[@id="people_b6ddcb6f-1970-439a-8a40-30ff0250447b"]/div
        //*[@id="people_b6ddcb6f-1970-439a-8a40-30ff0250447b"]/div/div[1]/div
        //*[@id="people_78da9c29-36f2-4b4c-a2f8-4dac831e2a05"]/div/div[1]/div
        //*[@id="people_78da9c29-36f2-4b4c-a2f8-4dac831e2a05"]/div/div[1]/div/div

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div[6]/div/button[1]")).click();


    }

    @Then("I type a message and hit send")
    public void i_type_a_message_and_hit_send() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Message =
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]/div/div/div/div[3]/div/div[3]/div"));
        Message.click();
        Message.sendKeys("Hello this is an automated slack message");
        Message.sendKeys(Keys.ENTER);

    }
}
