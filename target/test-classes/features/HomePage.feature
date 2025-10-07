@HomePage

Feature: Home Page Navigation
 As a user, I want to navigate through the Home page to access different forms.

 Scenario: Navigate to Get in Touch via header
  Given the user is on the Home page
  When the user clicks the Get Started button in the header
  Then the Get in Touch form should appear

 Scenario: Navigate to Get in Touch via page content
  Given the user is on the Home page
  When the user clicks the Get Started button in the page content
  Then the Get in Touch form should appear

 Scenario: Navigate to Get in Touch via Ready to Start section
  Given the user is on the Home page
  When the user clicks the Get Started button in the Ready to Start section
  Then the Get in Touch form should appear

