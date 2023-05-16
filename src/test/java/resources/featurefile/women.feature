@regression
Feature: Women Test

  As user I want to click on women tab ,inside women tab hoovering the tops option
  and sorting jackets options
@sanity
  Scenario: Verify the sort by product name display in alphabetical order
    Given  I am on Home page
    When   I  hovering mouse on women menu
    Then   Verify the products name display in alphabetical order after sorting product name

@smoke
  Scenario:  Verify the  Price filter low to high
    Given  I am on Home page
    When   I  hovering mouse on women menu
    And    I  hovering mouse on Tops
    And    I click on jackets option
    Then   Verify the  price filter low to high after sorting price filter
