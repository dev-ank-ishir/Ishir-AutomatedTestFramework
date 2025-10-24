@InnovationAccelerator

Feature: Innovation Accelerator Page Navigation
  As a user, I want to navigate through the Innovation Accelerator Page to access different forms.

  Scenario: Navigate to Innovation Accelerator Menu
    Given the user is on the Home page
    When the user clicks the Expertise Menu
    And hovers Accelerator Menu
    And clicks Innovation Accelerator Menu
    Then Innovation Accelerator page should appear

  Scenario: Navigate to Get in Touch via main banner of Innovation Accelerator page
    Given the user is on the Innovation Accelerator page
    When the user clicks Get Started button on main banner of Innovation Accelerator Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Start Innovation Journey section
    Given the user is on the Innovation Accelerator page
    When the user clicks Start Innovation Journey today within Innovation Journey section
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Ready to innovate section
    Given the user is on the Innovation Accelerator page
    When the user clicks Get Started within Ready to Innovate section
    Then the Get in Touch form should appear
