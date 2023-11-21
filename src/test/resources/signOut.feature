Feature: Sign out
  As an existing and signed in user
  I want to sign out from the webshop
  So that I can't reach my basket

  Rule: It is allowed to logout from the webshop

    Background:
      Given I open the TESCO webshop page
      And accept cookies
      And I login with a valid username and password


    Scenario: Sign out successful
      Given I am on the products page
      When I sign out
      Then Bejelentkezés button is available