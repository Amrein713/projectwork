Feature: Change the language

  Rule:

    Background:
    Scenario: Change the language of the main page from Hungarian to English
      Given I am on the "Magyar" login page
      When I change the language to "English"
      Then it shows the main page in "English"

    Scenario: Change the language of the main page from English to Hungarian
      Given I am on the "English" login page
      When I change the language to "Magyar"
      Then it shows the main page in "Magyar"