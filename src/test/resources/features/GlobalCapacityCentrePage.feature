@GlobalCapacityCentre

Feature: Global Capacity Centre Navigation
  As a user, I want to navigate through the Global Capacity Centre to access different forms.

  Scenario: Navigate to Global Capacity Centre Page
    Given the user is on the Home page
    When the user hovers Staffing Menu
    And click Global Capacity Centre Menu
    Then Global Capacity Centre page should appear

  Scenario: Navigate to Get in Touch via Global Capacity Centre page
    Given the user is on the Global Capacity Centrepage
    When the user clicks Get Started button
    Then the Get in Touch form should appear
