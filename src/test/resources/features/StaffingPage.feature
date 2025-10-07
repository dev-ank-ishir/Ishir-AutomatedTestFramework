@StaffingPage

Feature: Staffing Page Navigation
  As a user, I want to navigate through the Staffing Page to access different forms.

  Scenario: Navigate to Staffing Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And click Staffing Menu option
    Then Staffing page should appear

  Scenario: Navigate to Get in Touch via Staffing page
    Given the user is on the Staffing page
    When the user clicks Get Started button
    Then the Get in Touch form should appear

