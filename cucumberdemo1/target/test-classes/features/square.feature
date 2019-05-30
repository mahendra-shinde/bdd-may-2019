Feature: Calculate SQUARE for given  number
  Calculate the Square for given number


  Scenario Outline: find square for number <number>
    When <number> is entered
    Then <ans> is returned
    Examples:
    | number | ans    |
    |     12 |    144 |
    |     25 |    625 |
    |    625 | 390625 |

