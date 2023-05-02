Feature: DataTable Ornek

  Scenario: Users List
    When Write username "busra"
    And Write username and Password "busra" and "1234"
    And Write username as DataTable
      | ismet |
      | busra |
      | Deniz |
      | Isil  |

    And Write username and password as DataTable
      | ismet | 1234 |
      | busra | 3454 |
      | Deniz | 8756 |
      | Isil  | 9765 |
