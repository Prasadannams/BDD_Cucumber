Feature: Drucare Application Login

  Scenario Outline: Try to login application
    Given User should be there in loginpage
    When User enter <username> and <password>
    And Users click on login button
    Then Login should get succeess with infoe message

    Examples:
   | username | password |
   | druprudhvi | Drucare@1 |
   | checking | 12333 |