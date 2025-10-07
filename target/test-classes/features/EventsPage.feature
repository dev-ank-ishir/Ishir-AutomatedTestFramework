@EventsPage

Feature: Events Page Navigation
  As a user, I want to navigate through the Events page to access information and forms.

  Scenario: Navigate to Events page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Events option
    Then Events page should appear

  Scenario: Navigate to Get in Touch from Events page
    Given the user is on the Events page
    When the user clicks the Stay Updated button on Events Page
    Then the Get in Touch form should appear
