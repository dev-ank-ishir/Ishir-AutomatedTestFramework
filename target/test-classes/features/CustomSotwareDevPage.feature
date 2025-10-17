@CustomSoftDevPage

Feature: Custom Software Dev Page Navigation
  As a user, I want to navigate through the Custom Software Dev Page to access different forms.

  Scenario: Navigate to Custom Software Dev Menu
    Given the user is on the Home page
    When the user hovers Software dev support Menu
    And click Custom Software Development
    Then Custom Software Dev page should appear

  Scenario: Navigate to Get in Touch via main banner for custom software dev page
    Given the user is on the custom software dev page
    When user clicks Get Started on main banner custom software dev page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via product Journey banner for custom software dev page
    Given the user is on the custom software dev page
    When user clicks Get Started on product Journey section
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Find Business problem for custom software dev page
    Given the user is on the custom software dev page
    When user clicks Get Started on Find Business problem section
    Then the Get in Touch form should appear
