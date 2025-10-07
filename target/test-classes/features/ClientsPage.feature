@ClientsPage

Feature: Clients Page Navigation
  As a user, I want to navigate through the Clients page to access information and forms

  Scenario: Navigate to Clients page
    Given the user is on the Home page
    When the user opens the Work dropdown
    And selects the Clients option
    Then Clients page should appear

  Scenario: Navigate to Get in Touch from Clients page using clients section
    Given the user is on the clients page
    When the user clicks start your innovation journey button
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch from Clients page using Let's talk link
    Given the user is on the clients page
    When the user clicks Let's talk link
    Then the Get in Touch form should appear
