package utilities;

import browser.BrowserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperUtilities {

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BrowserHelper.getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void waitElementWhenReady(WebElement element,Integer time){
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getWebDriver(),time);
        WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
    }
}
