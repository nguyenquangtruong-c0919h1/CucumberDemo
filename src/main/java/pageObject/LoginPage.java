package pageObject;

import browser.BrowserHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends HomePage {
    private By txtUserName = By.cssSelector("#username");
    private By txtPassword = By.cssSelector("#password");
    private By btnLogin = By.xpath("//input[@type='submit']");
    private String lblMessage = "//p[@class='message error LoginForm']";

    private WebElement getTxtUserName() {
        return BrowserHelper.getWebDriver().findElement(txtUserName);
    }

    private WebElement getTxtPassword() {
        return BrowserHelper.getWebDriver().findElement(txtPassword);
    }

    private WebElement getBtnLogin() {
        return BrowserHelper.getWebDriver().findElement(btnLogin);
    }

    private WebElement getLblMessage(String message) {
        return BrowserHelper.getWebDriver().findElement(By.xpath(String.format(lblMessage, message)));
    }

    public void fillDataForLogin(String userName, String password) {
        getTxtUserName().sendKeys(userName);
        getTxtPassword().sendKeys(password);
    }

    public boolean isLblMessageDisplayed(String message) {
        return getLblMessage(message).isDisplayed();
    }
}
