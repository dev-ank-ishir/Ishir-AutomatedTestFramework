@StrategicAdvisoryPage

Feature: Strategic Advisory Page Navigation
  As a user, I want to navigate through the Strategic Advisory Page to access different forms.

  Scenario: Navigate to Strategic Advisory Services Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And click Strategic & Advisory Menu option
    Then Strategic Advisory Services Menu should appear

  Scenario: Navigate to Get in Touch via Start Your Journey
    Given the user is on the Strategic & Advisory page
    When the user clicks Start Your Journey button
    Then the Get in Touch form should appear