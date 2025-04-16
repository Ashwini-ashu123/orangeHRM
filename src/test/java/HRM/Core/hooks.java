package HRM.Core;

import HRM.Utility.initializeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class hooks extends HRM.Core.testContext {
    @Before
    public void setup(){
        WebDriver driver = initializeDriver.initializeDriver("firefox");
        setDriver(driver);
    }
    @After
    public void teardown(){
        WebDriver driver = getDriver();
        if (driver != null){
            driver.quit();

        }
    }
}
