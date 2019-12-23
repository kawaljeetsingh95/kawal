
Feature: Negative scenario

  Scenario Outline: Invalidlogin functionality
    Given I am on instagram page
    And Fill the "<username>" and "<password>" in field
    When click on the login button
    And apply assertion on cases "<errormessage>"
    Examples:
      | username         | password    | errormessage                                                           |
      | kawaljeetsingh   | kawaljeet95 | Sorry, your password was incorrect. Please double-check your password. |
      | kawaljeetsingh95 | kawaljeet   | Sorry, your password was incorrect. Please double-check your password. |
      | kawal            | kawal95     | Sorry, your password was incorrect. Please double-check your password. |
      | kawal            |             | no error message                                                       |
      |                  | kawal95     | no error message                                                       |