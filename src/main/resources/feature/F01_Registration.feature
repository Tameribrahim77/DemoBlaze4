@Test
Feature: F01_Register | Guest user cloud create a new account
  Scenario: User registration Scenario
    When Clicking on SignUp from header
    And Enter Username
    And Enter Password
    And Click sign up button
    Then The successful popup appears