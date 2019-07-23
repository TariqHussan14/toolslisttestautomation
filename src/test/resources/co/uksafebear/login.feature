Feature: Login
  In order to access the website
  As a user
  I want to know if my login is successful

  Rules
  * The user must be informed if the login information is incorrect
  * The user must be informed if the login information is successful

  Glossary:
  *User: someone who wants to create a Tools list using our application
  *Supporters: This is what the customer calls 'Admin' users.


  @high-impact
  Scenario Outline: a valid user logs in to the application
    Given I am logged out,
    When I enter username "<username>" and Password "<password>"
    Then the user is informed that the login is successful,
    Examples:
      |username|password|
      |tester |letmein|
      |tester1|letmein|
      |Tester2|letmein|

    @to-do
    Scenario: an invalid user attempts to log in
      Given I am logged out
      When I enter username "attacker" and passwords "dontletmein"
      Then the user is informed that the login is unsuccessful

