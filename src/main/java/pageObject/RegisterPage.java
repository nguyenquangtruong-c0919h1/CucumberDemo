package pageObject;

import browser.BrowserHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends HomePage {
    private By txtEmail = By.cssSelector("#email");
    private By txtPassword = By.cssSelector("#password");
    private By txtConfirmPassword = By.cssSelector("#confirmPassword");
    private By txtPid = By.cssSelector("#pid");
    private By btnRegister = By.cssSelector("input[type=submit]");
    private By contentRegister = By.cssSelector("#content");

    private WebElement getTxtEmail() {
        return BrowserHelper.getWebDriver().findElement(txtEmail);
    }

    private WebElement getTxtPassword() {
        return BrowserHelper.getWebDriver().findElement(txtPassword);
    }

    private WebElement getTxtConfirmPassword() {
        return BrowserHelper.getWebDriver().findElement(txtConfirmPassword);
    }

    private WebElement getTxtPid() {
        return BrowserHelper.getWebDriver().findElement(txtPid);
    }

    private WebElement getBtnRegister() {
        return BrowserHelper.getWebDriver().findElement(btnRegister);
    }

    private WebElement getContentRegister() {
        return BrowserHelper.getWebDriver().findElement(contentRegister);
    }

    public void clickBtnRegister() {
        getBtnRegister().click();
    }

    public void fillDataForRegisterPage(String email, String password, String confirmPassword, String pid) {
        getTxtEmail().sendKeys(email);
        getTxtPassword().sendKeys(password);
        getTxtConfirmPassword().sendKeys(confirmPassword);
        getTxtPid().sendKeys(pid);
    }

    public String getTextForContentRegister() {
        return getContentRegister().getText();
    }
}
