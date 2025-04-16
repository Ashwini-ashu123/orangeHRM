package HRM.Steps;

import HRM.Core.testContext;
import HRM.Pages.adminPage;
import HRM.Pages.loginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs extends testContext {
    public Scenario Scenario;
    private loginPage loginPage;
    private adminPage adminPage;

    @Before
    public void before(Scenario Scenario) throws Exception{
        this.Scenario = Scenario;
        loginPage = new loginPage(getDriver());
         adminPage = new adminPage(getDriver());

    }

    @Given("User enter the OrangeHRM")
    public void user_enter_the_OrangeHRM() throws InterruptedException {
        loginPage.HRMURL();
        System.out.println("User has entered OrangeHRM.");
    }

    @When("User enter the username {string} and Password {string}")
    public void userEnterTheUsernameAdminAndPasswordAdmin(String username,String pwd ) throws InterruptedException {
        loginPage.enterCredentials(username,pwd);
    }

    @And("User click on the Login button")
    public void userClickOnTheLoginButton() throws InterruptedException {
        loginPage.button();
    }

    @And("verify that user is in home page of orangeHRM")
    public void verifyThatUserIsInHomePageOfOrangeHRM() throws InterruptedException {
        loginPage.verifyinhomepage();
    }

    @And("Logout from the orangeHRM")
    public void logoutFromTheOrangeHRM() throws InterruptedException {
        loginPage.logout();
    }

    @And("click on the Admin tab on the home page")
    public void clickOnTheAdminTabOnTheHomePage() throws InterruptedException {
        adminPage.adminTab();
    }

    @And("verify that user is on the Admin page and click on the add button to add the user")
    public void verifyThatUserIsOnTheAdminPageAndClickOnTheAddButtonToAddTheUser() throws InterruptedException {
        adminPage.verifyAdminPage();

    }

    @And("login user will fill the details to add the user in portal")
    public void loginUserWillFillTheDetailsToAddTheUserInPortal(DataTable dataTable) throws InterruptedException {
        List<Map<String,String>> userAddOn = dataTable.asMaps(String.class,String.class);

        for(Map<String,String> row : userAddOn ){
            String UserRole = row.get("UserRole");
            String Status =  row.get("Status");
            String EmployeeName = row.get("EmployeeName");
            String Username = row.get("Username");
            String Password = row.get("Password");
            String ConfirmPassword = row.get("Confirm Password");

            adminPage.fillForm( UserRole, Status, EmployeeName, Username, Password, ConfirmPassword);

        }
    }

    @And("click on the Save button")
    public void clickOnTheSaveButton() throws InterruptedException {
        adminPage.submit();
    }
}