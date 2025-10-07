@InsightPage

Feature: About SuccessStories page Navigation
  As a user, I want to navigate through the Insight page to access information and forms.

  Scenario: Navigate to Insight page
    Given the user is on the Home page
    When the user clicks the Insight option
    Then Insight page should appear

  Scenario: Navigate to Get in Touch from Insight page
    Given the user is on the Insight page
    When the user clicks the Read More link
    And user clicks Get Started button over Insight detail
    Then the Get in Touch form should appear
