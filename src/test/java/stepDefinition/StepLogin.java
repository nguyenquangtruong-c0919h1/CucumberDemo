package stepDefinition;

import dataTable.CommonDataTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.testng.Assert;
import pageObject.LoginPage;
import utilities.Constant;
import utilities.Log;

import java.util.List;
import java.util.Map;

public class StepLogin implements En {
    private LoginPage loginPage = new LoginPage();

    public StepLogin() {

        And("I enter data for Login page with below information", (DataTable dataTable) -> {
            Log.info("User enter the Username and Password");
            loginPage.fillDataForLogin(CommonDataTable.getDataForField("userName", dataTable), CommonDataTable.getDataForField("password", dataTable));
        });

        Then("Login successfully with valid account", ( DataTable dataTable) -> {
            Log.info("Login successfully with username {userName}");
            Assert.assertTrue(loginPage.isNameAccountOnHomePageDisplayed(CommonDataTable.getDataForField("userName", dataTable)), "Login fail");
        });

        Then("System should display error message {string}", (String errorMessage) -> {
            Log.info("System should display error message {errorMessage}");
            Assert.assertTrue(loginPage.isLblMessageDisplayed(errorMessage), "Login successfully");
        });


    }
}
