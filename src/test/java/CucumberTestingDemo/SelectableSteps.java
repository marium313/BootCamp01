//package CucumberTestingDemo;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SelectableSteps {
//    private WebDriver driver;
//
//    public SelectableSteps() {
//    }
//
//    @Given("I am on the Selectable page")
//    public void i_am_on_the_Selectable_page() {
//        WebDriverManager.chromedriver().setup();
//        this.driver = new ChromeDriver();
//        this.driver.get("https://demoqa.com/selectable");
//    }
//
//    @When("I click on the option one")
//    public void i_click_on_the_option_one() {
//        this.driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
//    }
//
//    @When("I click on the option two")
//    public void i_click_on_the_option_two() {
//        this.driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
//    }
//    @Then("I should see it turn blue")
//    public void i_should_see_it_turn_blue() {
//        Assert.assertTrue(this.driver.getCurrentUrl().contains(".."));
//        this.driver.quit();
//    }
//}
