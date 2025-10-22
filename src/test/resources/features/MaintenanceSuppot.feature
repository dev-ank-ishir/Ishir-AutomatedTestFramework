@MaintenanceSupport

Feature: Maintenance Support Page Navigation
  As a user, I want to navigate through the Maintenance Support Page to access different forms.

  Scenario: Navigate to Maintenance Support Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Digital Innovation Menu
    And click Maintenance Support Menu
    Then Maintenance Support page should appear

  Scenario: Navigate to Get in Touch via Maintenance Support page
    Given the user is on the Maintenance Support page
    When user clicks Get Started button on main banner of Maintenance Support Page
    Then the Get in Touch form should appear
