Feature: Sign in with email address and password

  Rule: Login is possible with an existing user

    Background:
      Given I open the TESCO webshop page
      And I accept cookies

    Scenario: Sign in successful
      Given I am on the login page
      And I am not logged in
      When I login with a my email "teszelek713@freemail.hu" and password "Cucumber1234"
      Then I am on the products page
      And I see the basket icon

  Rule: Login is impossible with an incorrect password

    Scenario: Sign in unsuccessful
      Given I am on the login page
      And I am not logged in
      When I login with my email "teszelek713@freemail.hu" and password "Cucumber4321"
      Then I see the error message