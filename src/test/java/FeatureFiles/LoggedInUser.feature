Feature: Logging in on webpage

  Scenario: User logs in into the webpage
    Given User navigates to the login page
    When User successfully enters the login credentials
    Then User lands on product catalogue  page
