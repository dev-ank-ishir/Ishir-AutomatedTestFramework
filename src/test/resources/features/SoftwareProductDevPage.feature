@SoftwareProductDev

Feature: Software Product Development Page Navigation
  As a user, I want to navigate through the Software Product Development page to access different forms.

  Scenario: Navigate to Software Product Development Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Digital Innovation Menu
    And clicks Software Product Development Menu
    Then Software Product Development page should appear

  Scenario: Navigate to Get in Touch via main banner of Software Product Development page
    Given the user is on the Software Product Development page
    When the user clicks Get Started button on main banner of Software Product Development page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Start Your Product Journey section
    Given the user is on the Software Product Development page
    When the user clicks Get Started within Start Your Product Journey section
    Then the Get in Touch form should appear
