Feature: Test the login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And User is on login page
    When User enters "<username>" and "<password>"
    And user clicks on login
    Then User is navigated to the home page

    Examples:
      | username  | password    |
      | student   | Password123 |

  Scenario: Negative username test
    Given browser is open
    And User is on login page
    When User enters "incorrectUser" and "Password123"
    And user clicks on login
    Then An error message is displayed
    And The error message text is "Your username is invalid!"

  Scenario: Negative password test
    Given browser is open
    And User is on login page
    When User enters "student" and "incorrectPassword"
    And user clicks on login
    Then An error message is displayed
    And The error message text is "Your password is invalid!"


#Feature: Test the login functionality
#
#  Background:
#    Given browser is open
#    And User is on login page
#
#  Scenario Outline: Verify login with different credentials
#    When User enters "<username>" and "<password>"
#    And user clicks on login
#    Then "<result>" is displayed
#
#    Examples:
#      | username       | password         | result                       |
#      | student        | Password123      | User is navigated to the home page |
#      | incorrectUser  | Password123      | An error message is displayed: "Your username is invalid!" |
#      | student        | incorrectPassword| An error message is displayed: "Your password is invalid!" |
