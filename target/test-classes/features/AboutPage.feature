@AboutPage

Feature: About Page Navigation
  As a user, I want to navigate through the About page to access information and forms.

  Scenario: Navigate to Our Story page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Our Story option
    Then the Our Story page should appear

  Scenario: Navigate to Get in Touch from Banner under Our Story page
    Given the user is on the Our Story page
    When the user clicks the Get Started button under banner
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch from How We Engage under Our Story page
    Given the user is on the Our Story page
    When the user clicks the Get Started button under How We Engage
    Then the Get in Touch form should appear