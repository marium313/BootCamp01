package CucumberTestingSlackDemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "CucumberTestingSlackDemo"
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
