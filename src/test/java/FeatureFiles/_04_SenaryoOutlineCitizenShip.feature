#Senaryo
  #CitizenShip sayfasına gidiniz
  #Create işlemini doğrulayonız
  #Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız(negatif Test)

Feature: Citizenship with scenario Outline

  Background: #before senaryo

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip Page


  Scenario Outline: Create citizenShip

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed


    When User delete the "<name>"
    Then Success message should be displayed
    Examples:
      | name     | short  |
      | busden56 | bu7ree |



