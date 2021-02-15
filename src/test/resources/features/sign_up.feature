@driver:chrome
Feature: Sign up
  As user
  I'd like to sign up into the New Experience Website
  To access to other functionalities


  Background: example
    Given She is on New Experience website

  Scenario Outline: Sign up successful
    When She signs up on New Experience website
      | firstName   | lastName   | email   | password   | dayBirth   | monthBirth   | yearBirth   | addressFirstName   | addressLastName   | company   | address   | addressLine2   | city   | state   | zipPostalCode   | country   | additionalInformation   | homePhone   | mobilePhone   | addressAlias   |
      | <firstName> | <lastName> | <email> | <password> | <dayBirth> | <monthBirth> | <yearBirth> | <addressFirstName> | <addressLastName> | <company> | <address> | <addressLine2> | <city> | <state> | <zipPostalCode> | <country> | <additionalInformation> | <homePhone> | <mobilePhone> | <addressAlias> |
    Then She should be able to see the text <greeting>
    Examples:
      | firstName | lastName | email           | password | addressFirstName | addressLastName | company       | address      | addressLine2 | city   | state | zipPostalCode | country       | additionalInformation | homePhone | mobilePhone | addressAlias | greeting                                                                                  |
      | Andrea    | Arias    | andre@andre.com | 123456   | Andrea           | Arias           | A2 Developers | Av 7 Central | Ap 102       | Dallas | Texas | 986072        | United States | NA                    | 5837840   | 3017731159  | Andre        | Welcome to your account. Here you can manage all of your personal information and orders. |
      #|Mr     |

  Scenario Outline: Sign up with <testCase>
    When She tried to sign up with a bad email
    Then She should be able to see the text <any>