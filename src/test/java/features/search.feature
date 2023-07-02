Feature: Product Search and place order
  As a user
  I want to be able to search for a product
  So that I can find the desired item quickly
  and able to place orders.

  Scenario Outline: Successful experince for products in both search and offers page
    Given User on GreenCart Landing page
    When User searched with short name <name> and extracted actual name of product
    Then User searched with <name> short name on offers page to check if product exist
    And Validate same product name displays on both screens
    Examples:
      | name |
      | Tom  |
      | Str  |
      | Pot  |

