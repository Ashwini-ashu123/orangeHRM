package HRM.Pages;

import HRM.Core.testContext;
import HRM.Utility.locatorProp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

import static java.lang.Thread.sleep;

public class projectPage extends testContext {

    private WebDriver driver;
    private WebDriverWait wbWait;

    By verifyTime = By.xpath(locatorProp.getObjectID("verifyTime"));
    By project =  By.xpath(locatorProp.getObjectID("project"));
    By verifyProject = By.xpath(locatorProp.getObjectID("verifyProject"));
    By Add = By.xpath(locatorProp.getObjectID("Add"));
    By projName = By.xpath(locatorProp.getObjectID("projName"));
    By desc = By.xpath(locatorProp.getObjectID("desc"));
    By addCust = By.xpath(locatorProp.getObjectID("addCust"));
    By name = By.xpath(locatorProp.getObjectID("name"));
    By save2 = By.xpath(locatorProp.getObjectID("save2"));
    By pAdminName = By.xpath(locatorProp.getObjectID("pAdminName"));
    By save1 = By.xpath(locatorProp.getObjectID("save1"));




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

    public void selectProject(String projectInfo) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(By.xpath("//span[contains(text(),'" + projectInfo + "')]")).click();
        sleep(2000);
        driver.findElement(project).click();
        sleep(2000);
        WebElement element = driver.findElement(verifyProject);
        if(element.isDisplayed()){
            System.out.println("user is in project page");
        }
        else{
            System.out.println("User is not in project page");
        }

    }
    public void clickAdd() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.findElement(Add).click();
        System.out.println("Add button is clicked");
        sleep(2000);
    }

    public void addProjectDetails(Map<String,String> data) throws InterruptedException {
        WebDriver driver = getDriver();
        sleep(4000);
        driver.findElement(projName).sendKeys(data.get("Name"));
        sleep(2000);
        System.out.println("project name is given");
        driver.findElement(desc).sendKeys(data.get("Description"));
        System.out.println("desc is give");
        sleep(4000);
        driver.findElement(addCust).click();
        sleep(3000);
        driver.findElement(name).sendKeys(data.get("Customer Name"));
        sleep(3000);
        driver.findElement(save2).click();
        sleep(3000);
        System.out.println("cus name is given");
        String ProAdminName = data.get("Project Admin");
        driver.findElement(pAdminName).sendKeys(ProAdminName);
        sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + ProAdminName + "')]"));
        element.click();
        sleep(2000);
        System.out.println("prodadmin is selected");
        driver.findElement(save1).click();
        sleep(2000);
        System.out.println("save  is selected");
        sleep(2000);
    }

}
