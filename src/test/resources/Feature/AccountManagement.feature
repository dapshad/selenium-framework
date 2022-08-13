@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page should be displayed

    Examples:
      | Firstname | Lastname | Email             | Password    | ConfirmPassword |
      | DeeDaps   | Olly     | daps1@yahoo.co.uk | Abiola@2021 | Abiola@2021     |

  @LoginInToAccount
  Scenario Outline: Login to my account using a valid login details
    Given I am on the Login page
    When I enter "<Email>" "<Password>"
    And I click on SignIn
    Then My account page should be opened

    Examples:
      | Email             | Password    |
      | daps1@yahoo.co.uk | Abiola@2021 |


