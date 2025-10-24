@CompanyPage

Feature: Company Page Navigation
  As a user, I want to navigate through the About page to access information and forms.

  Scenario: Navigate to Company page
    Given the user is on the Home page
    When the user opens the About dropdown
    And selects the Company option
    Then the Company page should appear

  Scenario: Navigate to Get in Touch from Banner under Company page
    Given the user is on the Company page
    When the user clicks the Get Started button under banner
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch from How We Engage under Company page
    Given the user is on the Company page
    When the user clicks the Get Started button under How We Engage
    Then the Get in Touch form should appear
