Feature: Search product
  As an existing and signed in user
  I want to search the products
  So that it will appear in the search results

  Rule: It is allowed to search on the page

    Background:
      Given I open the TESCO webshop page
      And accept cookies
      And I login with a valid username and password

    Scenario: Search product
      When I tip "Noriaki sushi" in the search field
      And click on the search button
      Then I can see the "Noriaki sushi" in the search results