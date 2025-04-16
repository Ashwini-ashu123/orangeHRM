Feature: Login to the OrangeHRM
  Login with vaild OrangeHRM user with admin access
  and perform the process for the admin

  Scenario: Login to the OrangeHRM
    Given User enter the OrangeHRM
    When User enter the username 'Admin' and Password 'admin123'
    And User click on the Login button
    And verify that user is in home page of orangeHRM
    And Logout from the orangeHRM

    Scenario:Login to the OrangeHRM and add the new user as admin
      Given User enter the OrangeHRM
      When User enter the username 'Admin' and Password 'admin123'
      And User click on the Login button
      And verify that user is in home page of orangeHRM
      And click on the Admin tab on the home page
      And verify that user is on the Admin page and click on the add button to add the user
      And login user will fill the details to add the user in portal
      |   UserRole   | Status    |    EmployeeName  |     Username     |    Password     |  Confirm Password  |
      |   Admin      | Enabled   |    Nimisha M A|    King Khan         | Admin@7777      |  Admin@7777        |
      And click on the Save button
      And verify the user is added in the portal


      Scenario: Login to OrangeHRM and add the new project information
        Given User enter the OrangeHRM
        When User enter the username 'Admin' and Password 'admin123'
        And User click on the Login button
        And verify that user is in home page of orangeHRM
        And user click on the 'Time' tab and verify the user in Time page










