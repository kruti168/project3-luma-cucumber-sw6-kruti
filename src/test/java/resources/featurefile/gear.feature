@regression
Feature: Gear Test
  As user I want to click on Gear tab,
  Inside gear tab click on bags option and add to shopping cart
@smoke
  Scenario: I should update product successfully to shopping cart
    Given   I am on Home page
    When    I should hoovering mouse on gear menu
    And     I click on bags
    And     I click on product name 'Overnight Duffle'
    And     Verify text OvernightDuffle
    And     I should change Qty 3
    And     I should click on product name Overnight Duffle Add to Cart button
    And     Verify the text You added Overnight Duffle to your shopping cart
    And     I should click on shopping cart link into message
    And     Verify the product price ‘$135.00’
    And     Change Qty to ‘5’

    Then    I should update product successfully to shopping cart
    And     verify the product price '225.00'