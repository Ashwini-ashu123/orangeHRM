package HRM.Pages;

import HRM.Core.testContext;
import HRM.Utility.locatorProp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class projectPage extends testContext {

    private WebDriver driver;
    private WebDriverWait wbWait;

    By verifyTime = By.xpath(locatorProp.getObjectID("verifyTime"));


    public projectPage (WebDriver webdriver){
        this.driver = webdriver;
        setDriver(driver);
        this.wbWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public  void selectTime(String time) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(By.xpath("//span[text()='" + time + "']")).click();
        sleep(1000);
        System.out.println("Time tab is clicked");
        WebElement element = driver.findElement(verifyTime);
        if(element.isDisplayed()){
            System.out.println("time page is displayed");

        }
        else{
            System.out.println("time page is not displayed");
        }
    }

}
