
Feature: Automate the form

  Scenario: Fill the QAforms
    Given I am on the form page
    And I select forms details as follows
      | firstname | lastname | dates      | sex  | years of experience | profession        | Automation Tool    | continents1 | multiple  | selenium commands |
      | kawaljeet | singh    | 20/11/1995 | Male | 5                   | Automation Tester | Selenium Webdriver | Europe      | Australia | Wait Commands     |
      | amanpreet | singh    | 12/9/2006  |      |                     |                   |                    |             |           |                   |
      | arjun     | rathore  | 10/5/2008  |      |                     |                   |                    |             |           |                   |
