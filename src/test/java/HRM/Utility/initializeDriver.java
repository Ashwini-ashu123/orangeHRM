package HRM.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class initializeDriver {
    public static WebDriver initializeDriver(String browserName) {
        WebDriver driver = null;
        switch (browserName.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not support" + browserName);
        }
        driver.manage().window().maximize();
        return driver;
    }


}
