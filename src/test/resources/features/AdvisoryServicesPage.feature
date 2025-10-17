@AdvisoryServices

Feature: Advisory Services Page Navigation
  As a user, I want to navigate through the Advisory Services Page to access different forms.

  Scenario: Navigate to Advisory Services Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And clicks advisory Services Menu option
    Then Advisory Services Menu should appear

  Scenario: Navigate to Get in Touch via Start Your Journey
    Given the user is on the Advisory Services page
    When the user clicks Start Your Journey button
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Schedule a Consultation
    Given the user is on the Advisory Services page
    When user clicks Schedule a Consultation button on AdvisoryPage
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Reach out to us
    Given the user is on the Advisory Services page
    When user clicks Learn More button over Reach out to us section
    Then the Get in Touch form should appear
