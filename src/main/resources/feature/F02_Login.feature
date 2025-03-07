@Test
  Feature: F02_Login | Registered user cloud login the system
    Scenario: User login Scenario
      When Clicking Login from header
      And Enter user Username
      And Enter user Password
      And Click login button
      Then Successful login happened