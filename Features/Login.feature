Feature: Test login functionality on SDET University

  Scenario: User should be able to login with correct user name and correct password
    Given user is on login page
    When user enters correct user name and correct password
    Then user sees confirmation