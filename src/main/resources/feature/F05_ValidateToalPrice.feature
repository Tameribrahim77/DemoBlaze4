@Test
Feature: Validate product price calculations
  Scenario: Verify total price equals the sum of individual product prices
    When Navigate to cart page
    And  Retrieve product one price
    And  Retrieve product two price
    And  Retrieve the total price displayed
    Then The sum of product prices should equal the total price