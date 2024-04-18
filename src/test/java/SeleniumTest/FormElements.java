package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

    public class FormElements {

        WebDriver driver;

        public FormElements(WebDriver driver) {
            this.driver = driver;
        }

        By firstName = By.id("firstName");
        By lastName = By.id("lastName");
        By email = By.id("userEmail");
        By gender = By.id("gender-radio-1");
        By mobile = By.id("userNumber");
        By enterSubject = By.xpath("//*[@id=\"subjectsInput\"]");

        By enterAddress = By.xpath("//*[@id=\"currentAddress\"]");


        public void enterFirstName(String fName) {
            driver.findElement(firstName).sendKeys(fName);
        }

        public void enterLastName(String lName) {
            driver.findElement(lastName).sendKeys(lName);
        }

        public void enterEmail(String UserEmail) {
            driver.findElement(email).sendKeys(UserEmail);

        }
        public void selectGender(){
            driver.findElement(gender).click();
        }


        public void enterMobile(String MobileNumber) {
            driver.findElement(mobile).sendKeys(MobileNumber);
        }


        public void enterSubject(String subject) {
            driver.findElement(enterSubject).sendKeys(subject);
            driver.findElement(enterSubject).sendKeys(Keys.ENTER);
        }


        public void enterAddress(String address) {
            driver.findElement(enterAddress).sendKeys(address);

        }
    }

