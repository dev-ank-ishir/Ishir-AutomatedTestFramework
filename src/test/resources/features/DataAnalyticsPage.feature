@DataAnalytics

Feature: Data Analytics Page Navigation
  As a user, I want to navigate through the Data Analytics Page to access different forms.

  Scenario: Navigate to Data Analytics Menu
    Given the user is on the Home page
    When the user clicks the Services Menu
    And hovers Data+AI Menu
    And clicks Data Analytics Menu
    Then Data Analytics page should appear

  Scenario: Navigate to Get in Touch via main banner of Data Analytics page
    Given the user is on the Data Analytics page
    When user clicks Get Started button on main banner of Data Analytics Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via How We Engage section of Data Analytics page
    Given the user is on the Data Analytics page
    When user clicks Get Started on How We Engage section of Data Analytics Page
    Then the Get in Touch form should appear