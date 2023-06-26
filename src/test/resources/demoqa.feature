Feature: Add User

  Scenario: Add a new user
    Given I am on the demoqa page
    When I click the Add button
    And I enter the first name "Ivan"
    And I enter the last name "Ivanov"
    And I enter the email "Ivanov@gmail.com"
    And I enter the age "35"
    And I enter the salary "5000"
    And I enter the department "office"
    And I click the Submit button
    Then Close the page