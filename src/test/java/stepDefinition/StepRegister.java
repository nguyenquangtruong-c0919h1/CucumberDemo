package stepDefinition;

import browser.BrowserHelper;
import dataTable.CommonDataTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.testng.Assert;
import pageObject.RegisterPage;
import utilities.Constant;
import utilities.DataHelper;
import utilities.HelperUtilities;
import utilities.Log;

public class StepRegister implements En {
    private RegisterPage registerPage = new RegisterPage();

    public StepRegister() {

        And("I enter data for Register page with below information", (DataTable data) -> {
            Log.info("User enters email password, confirmPassword and pid");
            registerPage.fillDataForRegisterPage(
                    DataHelper.concatString(DataHelper.setRandomCharacter(),CommonDataTable.getDataForField("email",data)),
                    CommonDataTable.getDataForField("password",data),
                    CommonDataTable.getDataForField("confirmPassword",data),
                    CommonDataTable.getDataForField("pid",data));
        });

        Then("I register successfully", () -> {
            Log.info("User registers successfully");
            Assert.assertEquals(registerPage.getTextForContentRegister(), Constant.content_register_success);
        });

    }
}
