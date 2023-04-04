Feature: User Registration

  Scenario: user registration with different data
    Given user is on registration page
    When user enters following user details
      | vikas    | parabkar | vikas@gmail.com    | 9999 | kolhapur |
      | narendra | modi     | narendra@gmail.com | 8888 | gujrat   |
      | rahul    | gandhi   | rahul@gmail.com    | 7777 | delhi    |
    Then user registration should be successful

  Scenario: user registration with different data with columns
    Given user is on registration page
    When user enters following user details with columns
      | fName    | lName    | emailId            | phoneNumber | City     |
      | vikas    | parabkar | vikas@gmail.com    |        9999 | kolhapur |
      | narendra | modi     | narendra@gmail.com |        8888 | gujrat   |
      | rahul    | gandhi   | rahul@gmail.com    |        7777 | delhi    |
    Then user registration should be successful
	
#	Scenario: check hrm login page
#	Given user navigate to hrm page
	