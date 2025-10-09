@EventsPage

Feature: Events Page Navigation
  As a user, I want to navigate through the Events page to access information and forms.

  Scenario: Navigate to Events page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Events option
    Then Events page should appear

  Scenario: Navigate to Get in Touch from Events main page
    Given the user is on the Events page
    When the user clicks the Stay Updated button on Events Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch from Events detail page
    Given the user is on the Events page
    When the user clicks Read More over available event
    And the user clicks Let's talk image
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch from Trending Blogs page
    Given the user is on the Events page
    When the user clicks the trending blog
    And click Get Started button under blog page
    Then the Get in Touch form should appear
