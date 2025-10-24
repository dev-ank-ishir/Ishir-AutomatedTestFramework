@DigitalProductDev

Feature: Digital Product Development Page Navigation
  As a user, I want to navigate through the Software Product Development page to access different forms.

  Scenario: Navigate to Digital Product Development Menu
    Given the user is on the Home page
    When the user clicks the Expertise Menu
    And hovers Digital Product Innovation Menu
    And clicks Digital Product Development Menu
    Then Digital Product Development page should appear

  Scenario: Navigate to Get in Touch via main banner of Digital Product Development page
    Given the user is on the Digital Product Development page
    When the user clicks Get Started button on main banner of Digital Product Development page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Start Your Product Journey section
    Given the user is on the Digital Product Development page
    When the user clicks Get Started within Start Your Product Journey section
    Then the Get in Touch form should appear
