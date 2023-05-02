#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |
    And Click on the element in Dialog
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput       | <nameInput> |
      | codeInput       | <codeInput>  |
      | integrationCode | <integrationCode>      |
      | priority        | <priority>     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed
    And User delete item from Dialog Content
      | <nameInput> |
    Then Success message should be displayed
    Examples:
      | nameInput | codeInput | integrationCode | priority |
      | apa1       | an21     | 38              | 18100    |
      | goa2       | an22     | 39              | 18210    |
      | pya3       | an23     | 40              | 18320    |
      | etsya4     | an24     | 41              | 18430    |
      | amzna5     | an25     | 42              | 18540    |
