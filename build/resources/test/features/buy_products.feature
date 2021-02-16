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
      | firstName   | lastName   | email   | password   | address   | city   | state   | zipPostalCode   | country   | mobilePhone   |
      | <firstName> | <lastName> | <email> | <password> | <address> | <city> | <state> | <zipPostalCode> | <country> | <mobilePhone> |

    Examples:
      | firstName | lastName  | email   | password | address      | city   | state | zipPostalCode | country       | mobilePhone | addressAlias    |
      | Fulana    | Sultanita | a@a.com | 123456   | Av 7 Central | Dallas | Texas | 98607         | United States | 4           | Address Sultana |
