Feature: Sign up
  Scenario: Sign up with Valid email address
    Given I am in TalentTek signUp HomePage
    When I fill the form with valid email address
    And I click on the create my account button
    Then I verify that I successfully signup

  Scenario: Sign up without password
    Given I am in TalentTek HomePage
    When I fill the form without password
    And I click on the create my account button
    Then I verify that I get password inline validation error