package testRunner;

import baseTest.TestNGCucumberTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/register.feature"},
        glue = "stepDefinition")
public class TestRegister extends TestNGCucumberTest {

}
