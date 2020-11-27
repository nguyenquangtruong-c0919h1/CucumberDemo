Feature: Check function Register

  Scenario: Check valid register
    Given I am navigating to Railway Website
    When I click on "Register" tab
    And I enter data for Register page with below information
      | email             | password  | confirmPassword | pid         |
      | truonga@gmail.com | truong123 | truong123       | 11242342343 |
    And I click on "Register" button
    Then I register successfully