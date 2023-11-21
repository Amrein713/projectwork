Feature: Change the language
  As an existing user
  I want to change the language of the homepage from Hungarian to English
  So that the page appears in English

  Rule:

    Background:
      Given I open the TESCO webshop page
      And accept cookies

    Scenario: Change the language of the main page from Hungarian to English
      Given I am on the login page
      And I am not logged in
      And language is set to "Magyar"
      When I change the language to "English"
      Then it shows the main page in "English"
