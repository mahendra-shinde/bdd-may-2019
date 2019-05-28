Feature:    Search product
  Allows users to search product by name, user may not enter full product name but can be just partial name.


  ## Every feature should actually have multiple scenarios (Test Cases!)
  Scenario:   User searching for an existing product
    Given   User at home page
    When    User searches for product "Dell Inspiron"
    Then    Search page should display list of matching products

  Scenario: User searching for a non-existing product
    Given   User at home page
    When    User searched for product "Infinity Gaunlet"
    Then    Search page should display an error "No matching product found!"