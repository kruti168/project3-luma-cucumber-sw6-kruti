@regression
Feature: Men Test
  As user I want to click on men tab, Inside men tab hoovering the bottoms option
  and add product in shopping cart
@sanity
  Scenario: I should add product successfully to shopping cart
    Given   I am on Home page
    When    I should hoovering mouse on men menu
    And     I should hoovering  mouse on Bottoms
    And     I click on Pants
    And     I should click on Add to Cart button
    And     I should click on size 32
    And     I should click on colour Black
    And     I should click on Add to Cart button
    Then    Verify the text Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    And     I should add product successfully to shopping cart
@smoke
  Scenario: Verify the text Shopping Cart,Product Name, Product Size, Product Colour
    Given   I am on Home page
    When    I should hoovering mouse on men menu
    And     I should hoovering  mouse on Bottoms
    And     I click on Pants
    And     I should click on Add to Cart button
    And     I should click on size 32
    And     I should click on colour Black
    And     I should click on Add to Cart button
    Then    Verify the text Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    And     I should add product successfully to shopping cart
    And     Verify the text Shopping Cart,Product Name, Product Size, Product Colour