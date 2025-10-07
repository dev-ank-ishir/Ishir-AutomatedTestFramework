@ProjectRescue

Feature: Project Rescue Page Navigation
  As a user, I want to navigate through the Project Rescue Page to access different forms.

  Scenario: Navigate to Project Rescue Menu
    Given the user is on the Home page
    When the user hovers Software dev support Menu
    And click Project Rescue Menu
    Then Project Rescue page should appear

  Scenario: Navigate to Get in Touch via Project Rescue page
    Given the user is on the Project Rescue page
    When the user clicks Get Started on Project Rescue page
    Then the Get in Touch form should appear
