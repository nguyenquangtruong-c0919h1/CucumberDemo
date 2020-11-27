Feature: Check function Login


  @Tag1
  Scenario:  Check that user can login successfully with valid account
    Given I am navigating to Railway Website
    When I click on "Login" tab
    And I enter data for Login page with below information
      | userName            | password  |
      | truong123@gmail.com | truong123 |
    And I click on "Login" button
    Then Login successfully with valid account
      | userName            |
      | truong123@gmail.com |

  Scenario:  Check the error message displays when users log in with invalid account
    Given I am navigating to Railway Website
    When I click on "Login" tab
    When I enter data for Login page with below information
      | userName            | password   |
      | truong123@gmail.com | truong1243 |
    And I click on "Login" button
    Then System should display error message "Invalid username or password. Please try again."

