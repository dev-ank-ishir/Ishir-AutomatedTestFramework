@TeamsPage

Feature: Teams Page Navigation
  As a user, I want to navigate through the Teams page to access information and forms.

  Scenario: Navigate to Teams page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Team option
    Then Team page should appear

  Scenario: Navigate to Get in Touch from Our Teams page
    Given the user is on the Our Story page
    When the user clicks the Get Started button on Teams Page
    Then the Get in Touch form should appear
