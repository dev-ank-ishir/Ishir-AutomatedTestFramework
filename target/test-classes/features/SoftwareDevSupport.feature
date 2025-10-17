@SoftwareDevSupport


Feature: Software Dev Support Page Navigation
  As a user, I want to navigate through the Software Dev Support Page to access different forms.

  Scenario: Navigate to Software Dev Support Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And click Software Dev Support Menu option
    Then Software Dev Support page should appear

  Scenario: Navigate to Get in Touch via Start Your Project Today
    Given the user is on the Software Dev Support page
    When the user clicks Start Your Project Today button
    Then the Get in Touch form should appear


  Scenario: Navigate to Get in Touch via Schedule a consultation today
    Given the user is on the Software Dev Support page
    When the user clicks Schedule a Consultation button
    Then the Get in Touch form should appear