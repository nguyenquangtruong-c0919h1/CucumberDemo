package stepDefinition;

import browser.BrowserHelper;
import io.cucumber.java8.En;
import pageObject.HomePage;
import utilities.Constant;
import utilities.Log;

public class CommonDefs implements En {
    private HomePage homePage = new HomePage();

    public CommonDefs() {
        Given("I am navigating to Railway Website", () -> {
            Log.info("I am navigating to Railway Website");
            BrowserHelper.navigateToUrl(Constant.URL);
        });

        When("I click on {string} tab", (String tabName) -> {
            Log.info("I click on {tabName} tab");
            homePage.clickTabName(tabName);
        });

        And("I click on {string} button", (String btnName) -> {
            Log.info("I click on {btnName} button");
            homePage.clickBtnSubmit(btnName);
        });
    }
}
