Feature: Drucare Application Login

  Scenario: Try to login application
    Given User should be there in loginpage
    When User enter username and password
    And Users click on login button
    Then Login should get succeess with infoe message
