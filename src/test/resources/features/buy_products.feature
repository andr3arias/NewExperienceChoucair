@driver:chrome
Feature: Buy Products
  As user
  I would like to add products to the cart
  To buy according to my needs

  Background: example

  Scenario Outline: buy products successfully
    Given she enters the store with her credentials
      | email   | password   |
      | <email> | <password> |

    When She tries to add products to cart
    Then she sends her purchase to a new address
      | address   | city   | state   | zipPostalCode   | country   | homePhone   | addressAlias   | payMode   |
      | <address> | <city> | <state> | <zipPostalCode> | <country> | <homePhone> | <addressAlias> | <payMode> |

    Examples:
      | email   | password | address      | city   | state | zipPostalCode | country       | homePhone | addressAlias | payMode      |
      |a@a.com | 123456   | Av 7 Central | Dallas | Texas | 98607         | United States | 4         | new address 2 | Pay by check |

