
@tag 
Feature: Login Functionality
 

  @tag1
  Scenario: Login with valid data
    Given user should nevigate to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User should enter the valid email and password
    And user should click on the login
    Then user should successfully login 
    

  