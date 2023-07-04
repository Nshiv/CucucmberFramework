Feature: Product Search on Landing page and Offer page

  Scenario Outline: Validate searched product with Offer page and Landing page
    Given User on GreenCart Landing page
    When Search with small name <name> and extracted actual name of product
    Then User searched with <name> short name on offers page to check if product exist
    And Validate same product name displays on both screens
    Examples:
      | name |
      | Tom  |
      | Str  |
      | Pot  |

