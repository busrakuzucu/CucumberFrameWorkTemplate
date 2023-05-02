Feature: Country Multi Scenerio

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create Country

    When create a country
    Then Success message should be displayed
  @Regression
  Scenario: Create a country 2
    When create a country name as "BusraUNLU7675" code as "bsdsdgkk8"
    Then Success message should be displayed