package HRM.Pages;

import HRM.Core.testContext;
import HRM.Utility.locatorProp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.io.IOException;
import java.time.Duration;

import static java.lang.Thread.sleep;


public class loginPage extends testContext {

    private WebDriver driver;
    private WebDriverWait wbWait;


    By usrnamefield = By.name(locatorProp.getObjectID("usrnamefield"));
    By pwdfield = By.name(locatorProp.getObjectID("pwdfield"));
    By loginbutton = By.xpath(locatorProp.getObjectID("loginbutton"));
    By dashboard = By.xpath(locatorProp.getObjectID("dashboard"));
    By Logout = By.xpath(locatorProp.getObjectID("Logout"));
    By profilelink = By.xpath(locatorProp.getObjectID("profilelink"));


    // Constructor
    public loginPage(WebDriver inputDriver) throws IOException {
        this.driver = inputDriver;
        setDriver(driver); // Optional if you're using this from testContext
        this.wbWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    public void HRMURL() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("URL opened successfully");
        sleep(2000);
    }


    public void enterCredentials(String username, String password) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(usrnamefield).sendKeys(username);
        System.out.println("Username entered successfully");
        sleep(1000);

        driver.findElement(pwdfield).sendKeys(password);
        System.out.println("Password entered successfully");
        sleep(1000);
    }


    public void button() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(loginbutton).click();
        System.out.println("Login button clicked");
        sleep(3000);
    }

    public void verifyinhomepage() throws InterruptedException {
        WebDriver driver = getDriver();
        WebElement element = driver.findElement(dashboard);
        if (element.isDisplayed()){
            System.out.println("we are in home page");
        }
        else {
            System.out.println("we are not in home page");
        }
        sleep(3000);

    }

    public void logout() throws InterruptedException {
        WebDriver driver=  getDriver();
        driver.findElement(profilelink).click();
        driver.findElement(Logout).click();
        System.out.println("Logout success");
        sleep(4000);
    }
}
