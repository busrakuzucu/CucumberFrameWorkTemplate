Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

@Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | bsra98trdgd95 |
      | codeInput | b984dfgdg985  |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | bsra98trdgd95 |

    Then Success message should be displayed
  @Regression
  Scenario: Create Nationality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |
    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | bsra564546 |


    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | bsra564546 |

    Then Success message should be displayed
  @Regression
  Scenario: Fees Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |
    And Click on the element in Dialog
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput       | brsa5678 |
      | codeInput       | brs5845  |
      | integrationCode | 30  |
      | priority        | 1898    |
    And Click on the element in Dialog
      | toggleBar |
      | saveButton |
    Then Success message should be displayed
    And User delete item from Dialog Content
      | brsa5678 |
    Then Success message should be displayed
