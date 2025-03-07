@Test
Feature: F03_Register | Add product to cart

  Scenario: User Add Product to Cart Scenario
    When Clicking Login from header
    And Enter user Username
    And Enter user Password
    And Click login button
    And Clicking on Laptops Menu
    And Choose Product One
    And Add Product One to Cart
    And The successful add product popup appears
    And Navigate into homepage
    And Clicking on Laptops Menu Again
    And Choose Product Two
    And Add Product Two to Cart
    And Successful add product popup appears
    And Clicking on Cart
    Then The Two Products added
