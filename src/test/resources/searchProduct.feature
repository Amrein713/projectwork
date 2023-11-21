Feature: Search product
  As a user I want to search the products
  So that it will appear in the search results

  Rule: It is allowed to search on the page

    Background:
      Given I open the TESCO webshop page
      And I accept cookies


    Scenario: Search valid product
      When I search for "Noriaki sushi"
      Then I can see the "Noriaki sushi" in the search results



    Scenario: Search not existing product
      When I search for "Rolex karóra"
      Then I got an error message