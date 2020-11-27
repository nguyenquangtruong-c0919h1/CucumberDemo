package stepDefinition;

import browser.BrowserHelper;
import io.cucumber.java8.En;
import pageObject.HomePage;

public class Hook implements En {
    private HomePage homePage = new HomePage();

    public Hook() {

        After("@Tag1",1, () -> {
            homePage.clickTabName("Log out");
        });
        After(0, BrowserHelper::quitBrowser);
    }
}
