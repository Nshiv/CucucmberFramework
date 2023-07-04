Feature: Place order with multiple products
  As a user i want to add multiple products to cart
  so that i can place order.
  @Regression
  Scenario Outline: Add multiple products to cart and place order
    Given User on GreenCart Landing page
    When User search products from search bar with keyword <name>
    And Added all searched products to cart
    Then User should be able to place order successfully
    Examples:
      | name     |
      | Tomato   |
      | Cucumber |
      | Beetroot |

