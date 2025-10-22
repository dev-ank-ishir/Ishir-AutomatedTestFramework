@TalentAndSkillsPage

Feature: Talent & Skills Page Navigation
  As a user, I want to navigate through the Talent & Skills Page to access different forms.

  Scenario: Navigate to Talent & Skills Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And click Talent & Skills Menu option
    Then Talent & Skills page should appear

  Scenario: Navigate to Get in Touch via main banner on Talent & Skills page
    Given the user is on the Talent & Skills page
    When the user clicks main Get Started button
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via bottom banner on Talent & Skills page
    Given the user is on the Talent & Skills page
    When the user clicks bottom Get Started button
    Then the Get in Touch form should appear
