Feature: Change the language

  Rule:

    Background:
      Given I open the TESCO webshop page
      And I accept cookies

    Scenario: Change the language of the main page from Hungarian to English
      Given I am on the login page
      And language is set to "Magyar"
      When I change the language to "English"
      Then it shows the main page in "English"

    Scenario: Change the language of the main page from English to Hungarian
      Given I am on the login page
      And language is set to "English"
      When I change the language to "Magyar"
      Then it shows the main page in "Magyar"