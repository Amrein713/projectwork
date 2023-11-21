Feature: Sign in
  As an existing user
  I want to sign into the webshop
  So that I can reach my empty basket

  Rule: It is allowed to login into the webshop and reach a shopping basket

    Background:
      Given I open the TESCO webshop page
      And accept cookies

    Scenario: Sign in successful
      Given I am on the login page
      And I am not logged in
      When I login with a valid username and password
      Then I am on the products page
      And I see the basket icon

    Scenario: Sign in unsuccessful
      Given I am on the login page
      And I am not logged in
      When I login with an invalid username or password
      Then I see the error message