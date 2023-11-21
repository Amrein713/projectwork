Feature: Add product to the basket
  As an automated test user
  I want to add item into the basket
  So that the added item is stored in the basket

  Rule: It is allowed to add an item int the basket

    Background:
      Given I open the TESCO webshop page
      And accept cookies
      And I login with a valid username and password
      And I search for "Noriaki sushi"
      Then I can see the "Noriaki sushi" in the search results

    Scenario: Add product to the basket
      When I click on the "Hozzáad" button
      Then "Noriaki sushi" is in the basket