Feature: Search product
   Allows users to search product by name, user may not enter full product name but can be just partial name.

  Scenario: User searches product by name, any product who's name contains the word user has entered should be listed. In case no matching was found, it should display: "No products found!".
    Given User at home page of www.footpathmarket.com
    When user searches for product
    Then search page should display list of matching products
