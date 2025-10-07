@CustomSoftDevPage

Feature: Custom Software Dev Page Navigation
  As a user, I want to navigate through the Custom Software Dev Page to access different forms.

  Scenario: Navigate to Custom Software Dev Menu
    Given the user is on the Home page
    When the user hovers Software dev support Menu
    And click Custom Software Development
    Then Custom Software Dev page should appear

  Scenario: Navigate to Get in Touch via custom software dev page
    Given the user is on the custom software dev page
    When the user clicks Get Started on custom software dev page
    Then the Get in Touch form should appear
