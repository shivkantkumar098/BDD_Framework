Feature: Login Functionality
  Background:
    Given Browser should open

  Scenario: Login sucessfully
    As a user i am able to login through username and password
    Given user in on the login page
    When user enter username "standard_user"
    And password "secret_sauce"
    And click on login button
    Then user should be on the HomePage

