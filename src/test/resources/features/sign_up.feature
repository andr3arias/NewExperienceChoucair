@driver:chrome
Feature: Sign up
  As user
  I'd like to sign up into the New Experience Website
  To access to other functionalities


  Background: example
    Given She is on New Experience website

  Scenario Outline: Sign up successful
    When She tries to create an account at New Experience website
      | firstName   | lastName   | email   | password   |  address   |  city   | state   | zipPostalCode   | country   |  mobilePhone   |
      | <firstName> | <lastName> | <email> | <password> |  <address> |  <city> | <state> | <zipPostalCode> | <country> |  <mobilePhone> |
    Then She should be able to see the text <greeting>
    Examples:
      | firstName | lastName | email           | password | address      | city   | state | zipPostalCode | country       |mobilePhone | greeting                                                                                  |
      | Emma      | Arias    | emma@emma.com | 123456   | Av 7 Central | Dallas | Texas | 98607         | United States | 3017731159 | Welcome to your account. Here you can manage all of your personal information and orders. |


  Scenario Outline: Sign up with wrong email
    When She tries to create an account with a wrong email
    |email|
    |<email>|
    Then She should see the text <errorMessage>
    Examples:
    |email |errorMessage|
    |      |Invalid email address.            |
    |a     |Invalid email address.                   |
    |a@a.com      |An account using this email address has already been registered. Please enter a valid password or request a new one.|
