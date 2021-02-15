@driver:chrome
Feature: Sign up
  As user
  I'd like to sign up into the New Experience Website
  To access to other functionalities


  Background: example
    Given She is on New Experience website

  Scenario Outline: Sign up successful
    When She signs up on New Experience website
      | firstName   | lastName   | email   | password   |  address   |  city   | state   | zipPostalCode   | country   |  mobilePhone   |
      | <firstName> | <lastName> | <email> | <password> |  <address> |  <city> | <state> | <zipPostalCode> | <country> |  <mobilePhone> |
    Then She should be able to see the text <greeting>
    Examples:
      | firstName | lastName | email           | password | address      | city   | state | zipPostalCode | country       |mobilePhone | greeting                                                                                  |
      | Andrea    | Arias    | andre@andre.com | 123456   | Av 7 Central | Dallas | Texas | 986072        | United States | 3017731159 | Welcome to your account. Here you can manage all of your personal information and orders. |


  Scenario Outline: Sign up with <testCase>
    When She tried to sign up with a bad email
    Then She should be able to see the text <any>