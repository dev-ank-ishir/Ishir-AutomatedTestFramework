@SuccessStories
Feature: About SuccessStories page Navigation
  As a user, I want to navigate through the Success Stories page to access information and forms.

  Scenario: Navigate to Success Stories page
    Given the user is on the Home page
    When the user opens the Work dropdown
    And selects the Success Stories option
    Then the Success Stories page should appear

  Scenario: Navigate to Get in Touch from Success Stories page
    Given the user is on the Success Stories page
    When the user clicks the available view case study
    And clicks Contact US Today over case study
    Then the Get in Touch form should appear
