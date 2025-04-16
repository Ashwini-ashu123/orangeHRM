package HRM.Pages;

import HRM.Core.testContext;
import HRM.Utility.locatorProp;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class adminPage extends testContext{

    private WebDriver driver;
    private WebDriverWait wbwait;

    By Admin =  By.xpath(locatorProp.getObjectID("Admin"));
    By VerifyAdmin =  By.xpath(locatorProp.getObjectID("VerifyAdmin"));
    By Add = By.xpath(locatorProp.getObjectID("Add"));
    By Userrolefield = By.xpath(locatorProp.getObjectID("Userrolefield"));
    By statusfield = By.xpath(locatorProp.getObjectID("statusfield"));
    By empName = By.xpath(locatorProp.getObjectID("empName"));
    By passwordfield = By.xpath(locatorProp.getObjectID("passwordfield"));
    By confirmPwdField   = By.xpath(locatorProp.getObjectID("confirmPwdField"));
    By urNameField = By.xpath(locatorProp.getObjectID("urNameField"));
    By empNamedd = By.xpath(locatorProp.getObjectID("empNamedd"));
    By Save = By.xpath((locatorProp.getObjectID("Save")));

    public adminPage(WebDriver webDriver){
        this.driver = webDriver;
        setDriver(driver);
        this.wbwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);


    }

    public  void adminTab() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(Admin).click();
        System.out.println("Admin tab is click successfully");
        sleep(2000);
    }

    public void verifyAdminPage() throws InterruptedException {
        WebDriver driver = getDriver();
        WebElement element = driver.findElement(VerifyAdmin);
        if (element.isDisplayed()) {
            System.out.println("Admin page is selected successfully");
        } else {
            System.out.println("Admin page is not selected successfully");
        }
        sleep(1000);
        driver.findElement(Add).click();
        sleep(1000);
        System.out.println("Add selected successfully");
    }


    public void fillForm(String Userrole , String Status , String EmployeeName , String Username , String password, String ConfirmPassword ) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(Userrolefield).click();
        sleep(1000);
        System.out.println("userfield is clicked");
        sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'" + Userrole + "')]")).click();
        System.out.println("Admin is clicked");
        driver.findElement(statusfield).click();
        System.out.println("Status box  is clicked");
        sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'" + Status + "')]")).click();
        System.out.println("Enabled is clicked");
        sleep(3000);
        driver.findElement(empName).click();
        driver.findElement(empName).sendKeys(EmployeeName);
        sleep(5000);
        System.out.println("EmpName is clicked");
        driver.findElement(empNamedd).isDisplayed();
        driver.findElement(By.xpath("(//span[contains(text(),'" + EmployeeName + "')])[1]")).click();
        sleep(2000);
        System.out.println("EmpName is given");
        driver.findElement(passwordfield).click();
        System.out.println("pwd is click");
        sleep(1000);
        driver.findElement(passwordfield).sendKeys("//span[contains(text(),'" + password + "')]");
        System.out.println("pwd is given");
        sleep(2000);
        driver.findElement(confirmPwdField).click();
        sleep(1000);
        driver.findElement(confirmPwdField).sendKeys("//span[contains(text(),'" + ConfirmPassword + "')]");
        sleep(2000);
        System.out.println("cfmpwd is given");
        driver.findElement(urNameField).click();
        driver.findElement(urNameField).sendKeys(Username);
        sleep(2000);
        System.out.println("king is given");
    }

    public void submit() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(Save).click();
        System.out.println("save is clicked");
        sleep(3000);
    }




}