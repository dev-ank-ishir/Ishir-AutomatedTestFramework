@Accelerator

Feature: Accelerator Page Navigation
  As a user, I want to navigate through the Accelerator Page to access different forms.

  Scenario: Navigate to Accelerator Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And user clicks Accelerator Menu
    Then Accelerator page should appear

  Scenario: Navigate to Get in Touch via main banner of Accelerator page
    Given the user is on the Accelerator page
    When the user clicks Get Started button on main banner of Accelerator Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Accelerate Your Success section
    Given the user is on the Accelerator page
    When the user clicks Get Started on Accelerate Your Success section
    Then the Get in Touch form should appear
