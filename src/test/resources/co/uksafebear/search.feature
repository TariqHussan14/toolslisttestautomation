Feature: Delete Tool
  In order to delete a tool
  As a user
  I want to know if my was tool was deleted successfully

  Rules
  * The user must be informed if the tool was deleted successfully
  * The user must be informed if the message appears tool has successfully been removed

  Glossary:
  *User: someone who wants to delete a Tools list using our application
  *

@to-do
  @high-impact
  Scenario Outline: a valid user is able to delete a tool
    Given I am logged in,
    When i delete the name "<name>"
    Then a message appears tool has been romved successfully
    Examples:
      |name|
      |tester |
      |tester1|
      |Tester2|

  @to-do
  Scenario:
    Given I am logged in
    When I delete "Issac1"
    Then a message appears tool has been removed successfully
