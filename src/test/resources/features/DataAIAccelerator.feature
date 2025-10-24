@DataAIAccelerator

Feature: Data+AI Accelerator Page Navigation
  As a user, I want to navigate through the Data+AI Accelerator Page to access different forms.

  Scenario: Navigate to Data+AI Accelerator Menu
    Given the user is on the Home page
    When the user clicks the Expertise Menu
    And hovers Accelerator Menu
    And clicks Data+AI Accelerator Menu
    Then Data+AI Accelerator page should appear

  Scenario: Navigate to Get in Touch via main banner of Data+AI Accelerator page
    Given the user is on the Data+AI Accelerator page
    When the user clicks Get Started button on main banner of Data+AI Accelerator Page
    Then the Get in Touch form should appear

  Scenario: Navigate to Get in Touch via Ready to Accelerate section
    Given the user is on the Data+AI Accelerator page
    When the user clicks Get Started within Ready to Accelerate section
    Then the Get in Touch form should appear
