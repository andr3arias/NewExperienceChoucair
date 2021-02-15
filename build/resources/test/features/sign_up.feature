@driver:chrome
Feature: Sign up
  As user
  I'd like to sign up into the New Experience Website
  To access to other functionalities


  Background: example
    Given She is on New Experience website

  Scenario Outline: Sign up successful
    When She signs up on New Experience website
      |title|firstName|lastName|email|password|dayBirth|monthBirth|yearBirth|addressFirstName|addressLastName|company|address|addressLine2|city|state|zipPostalCode|country|additionalInformation|homePhone|mobilePhone|addressAlias|
      |<title>|<firstName>|<lastName>|<email>|<password>|<dayBirth>|<monthBirth>|<yearBirth>|<addressFirstName>|<addressLastName>|<company>|<address>|<addressLine2>|<city>|<state>|<zipPostalCode>|<country>|<additionalInformation>|<homePhone>|<mobilePhone>|<addressAlias>|
    Then She should be able to see the text <greeting>
    Examples:
      |title|firstName|lastName|email|password|dayBirth|monthBirth|yearBirth|addressFirstName|addressLastName| company     | address | addressLine2  | city  | state | zipPostalCode | country | additionalInformation | homePhone | mobilePhone | addressAlias  |greeting|
      |Mrs|Andrea   |Arias   |andre@andre.com|123456|1|May|1985    |Andrea|Arias                    |A2 Developers|Av 7 Central       |Ap 102|Dallas|Texas  |986072         |United States|NA                 |5837840    |3017731159   |Andre          |Andrea Arias   |Welcome to your account. Here you can manage all of your personal information and orders.|