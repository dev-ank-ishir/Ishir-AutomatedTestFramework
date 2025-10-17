@EnterpriseAI

Feature: EnterpriseAI Page Navigation
  As a user, I want to navigate through the EnterpriseAI Page to access different forms.

  Scenario: Navigate to EnterpriseAI Menu
    Given the user is on the Home page
    When the user hovers Strategic Advisory Menu
    And click EnterpriseAI Menu
    Then EnterpriseAI page should appear

  Scenario: Navigate to Get in Touch via  main banner of EnterpriseAI page
    Given the user is on the EnterpriseAI page
    When user clicks Get Started button on main banner of EnterpriseAI Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via how we engage section of EnterpriseAI page
    Given the user is on the EnterpriseAI page
    When user clicks Get Started on how we engage section of EnterpriseAI Page
    Then the Get in Touch form should appear