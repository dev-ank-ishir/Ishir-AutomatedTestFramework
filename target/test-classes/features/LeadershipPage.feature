@LeadershipPage
Feature: Leadership Page Navigation
  As a user, I want to navigate through the Leadership page to access information and forms.

  Scenario: Navigate to Leadership page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Leadership option
    Then Leadership page should appear

  Scenario: Navigate to Get in Touch from Leadership page
    Given the user is on the Company page
    When the user clicks the Get Started button on Leadership Page
    Then the Get in Touch form should appear
