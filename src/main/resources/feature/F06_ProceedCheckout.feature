@Test
Feature: Proceed to Checkout
  Scenario: Proceed to Checkout
    When Navigate to cart page
    And  Clicking Place Order
    And  Enter Name
    And  Enter Country
    And  Enter City
    And  Enter Credit card
    And  Enter Month
    And  Enter Year
    And  Clicking Purchase
    Then Success message appears