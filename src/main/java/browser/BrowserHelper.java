package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public enum SelectBrowser {
        CHROME, EDGE, FIREFOX
    }

    public static void startBrowser(SelectBrowser browsers) {
        switch (browsers) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
        }
        getWebDriver().manage().window().maximize();
    }

    public static WebDriver getWebDriver() {
        return driver.get();
    }

    public static void navigateToUrl(String url) {
        getWebDriver().get(url);
    }

    public static void closeBrowser() {
        getWebDriver().close();
    }

    public static void quitBrowser() {
        getWebDriver().quit();
    }
}
