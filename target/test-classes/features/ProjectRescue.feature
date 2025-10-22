@ProjectRescue

Feature: Project Rescue Page Navigation
  As a user, I want to navigate through the Project Rescue Page to access different forms.

  Scenario: Navigate to Project Rescue Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Digital Innovation Menu
    And click Project Rescue Menu
    Then Project Rescue page should appear

  Scenario: Navigate to Get in Touch via Get Started in main banner
    Given the user is on the Project Rescue page
    When the user clicks Get Started on main banner
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Get Started under common issues section
    Given the user is on the Project Rescue page
    When the user clicks Get Started on under common issues section
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Get Started under how we engage section
    Given the user is on the Project Rescue page
    When the user clicks Get Started on under how we engage section
    Then the Get in Touch form should appear