package pageObject;

import browser.BrowserHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.HelperUtilities;

public class HomePage {
    private String nameAccount = "//strong[contains(text(),'%s')]";
    private String tabMenu = "//div[@id='menu']//span[text()='%s']";
    private String btnName = "//input[@type='submit' and @value='%s']";

    private WebElement getNameAccount(String email) {
        return BrowserHelper.getWebDriver().findElement(By.xpath(String.format(nameAccount, email)));
    }

    private WebElement getTabMenu(String tabName) {
        return BrowserHelper.getWebDriver().findElement(By.xpath(String.format(tabMenu, tabName)));
    }

    private WebElement getBtnSubmit(String nameSubmit) {
        return BrowserHelper.getWebDriver().findElement(By.xpath(String.format(btnName, nameSubmit)));
    }

    public boolean isNameAccountOnHomePageDisplayed(String email) {
        HelperUtilities.waitElementWhenReady(getNameAccount(email), 10);
        return getNameAccount(email).isDisplayed();
    }

    public void clickTabName(String tabName) {
        getTabMenu(tabName).click();
    }

    public void clickBtnSubmit(String btnName) {
        HelperUtilities.scrollToElement(getBtnSubmit(btnName));
        getBtnSubmit(btnName).click();
    }

}
