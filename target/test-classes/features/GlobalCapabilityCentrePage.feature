@GlobalCapabilityCentre

Feature: Global Capability Centre Navigation
  As a user, I want to navigate through the Global Capability Centre to access different forms.

  Scenario: Navigate to on Global Capability Centre Page
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Talent & Skills Menu option
    And clicks Global Capability Centre Menu
    Then Global Capability Centre page should appear

  Scenario: Navigate to Get in Touch via Global Capability Centre page
    Given the user is on the Global Capability Centre page
    When the user clicks Get Started button on main banner GCC
    Then the Get in Touch form should appear
