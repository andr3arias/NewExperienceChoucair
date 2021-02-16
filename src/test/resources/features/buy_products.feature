Feature: Buy Products
  As user
  I would like to add products to the cart
  To buy according to my needs


  Background: example
    Given she enters the store with her credentials
      | email   | password   |
      | <email> | <password> |

  Scenario Outline: buy products successfully
    When She tries to add products to cart

    Then she sends her purchase to a new address
      | email         | password |
      | emma@emma.com | 123456   |
    Examples:
      | email         | password |
      | emma@emma.com | 123456   |
