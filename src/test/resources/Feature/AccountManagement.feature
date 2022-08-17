@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    And I click on my order
    And I click on what's new
    And I click on bra range
    And I click on Bra
    And I click on size
    Then My account page should be displayed

    Examples:
      | Firstname | Lastname | Email                 | Password    | ConfirmPassword |
      | DeeDaps   | Olly     | dapshad05@yahoo.co.uk | Abiola@2021 | Abiola@2021     |


  @LoginInToAccount
  Scenario Outline: Login to my account using a valid login details
    Given I am on the Login page
    When I enter "<Email>" "<Password>"
    And I click on SignIn
    And I click on my account summary
    Then My account page should be opened

    Examples:
      | Email           | Password    |
      | daps1@yahoo.com | Abiola@2021 |

  



