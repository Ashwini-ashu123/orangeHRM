package HRM.Core;

import org.openqa.selenium.WebDriver;

public class testContext {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
    public  void setDriver(WebDriver driver){
        this.driver = driver;
    }
}
