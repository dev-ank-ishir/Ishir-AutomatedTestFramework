@AgileTeamPods

Feature: Agile Team pods Navigation
  As a user, I want to navigate through the Agile Team Pods age to access different forms.

  Scenario: Navigate to on Demand Page
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Talent & Skills Menu option
    And click Agile Team Pods Menu
    Then On Agile Team Pods page should appear

  Scenario: Navigate to Get in Touch via Agile Team Pods page main banner
    Given the user is on the Agile Team Pods page
    When the user clicks Get Started button on Agile Pods main banner
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Agile Team Pods page How we engage section
    Given the user is on the Agile Team Pods page
    When user clicks Get Started under How we engage section
    Then the Get in Touch form should appear