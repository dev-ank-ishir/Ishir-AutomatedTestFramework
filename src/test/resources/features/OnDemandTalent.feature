@OnDemandTalent

Feature: On Demand Page Navigation
  As a user, I want to navigate through the On Demand Page to access different forms.

  Scenario: Navigate to on Demand Page
    Given the user is on the Home page
    When the user hovers Staffing Menu
    And click On Demand Talent Menu
    Then On Demand page should appear

  Scenario: Navigate to Get in Touch via On Demand Talent page
    Given the user is on the On Demand Talent page
    When the user clicks Get Started button on demand page
    Then the Get in Touch form should appear
