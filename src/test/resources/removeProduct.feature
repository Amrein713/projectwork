Feature: Remove product from the basket
  As an existing and signed in user
  I want to remove a product from the basket
  So that the product isn't listed in the basket

  Rule: It is allowed to remove a product from the basket

    Background:
      Given I open the TESCO webshop page
      And accept cookies
      And I login with a valid username and password
      And I search for "Noriaki sushi"
      And I can see the "Noriaki sushi" in the search results
      And I add "Noriaki sushi" to the basket

    Scenario: Remove product from the basket
      Given "Noriaki sushi" is in the basket
      When I open the basket page
      And click on the "-" button
      Then product will disappear from the basket