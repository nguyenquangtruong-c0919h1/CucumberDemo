package testRunner;

import baseTest.TestNGCucumberTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/login.feature"},
        glue = "stepDefinition")
public class TestLogin extends TestNGCucumberTest {


}
