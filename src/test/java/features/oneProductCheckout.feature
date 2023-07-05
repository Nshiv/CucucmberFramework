Feature: Product Search and place order
  As a user
  I want to be able to search for a product
  So that I can find the desired product
  and able to place order.

  @smoke
  Scenario Outline: Search product and place an order from landing screen
    Given User on GreenCart Landing page
    When User searched with short name <name>
    And  User added searched product to cart
    Then User proceed to checkout and validate the <name> items on checkout page

    Examples:
      | name |
      | Tom  |
