package baseTest;

import browser.BrowserHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

public class TestNGCucumberTest extends AbstractTestNGCucumberTests {

    @BeforeMethod
    @Parameters("browser")
    public void initDriver(String browser) {
        BrowserHelper.startBrowser(BrowserHelper.SelectBrowser.valueOf(browser.toUpperCase()));
    }

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
