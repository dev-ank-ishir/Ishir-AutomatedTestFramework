@NewsPage

Feature: News Page Navigation
As a user, I want to navigate through the News page to access information and forms.

Scenario: Navigate to News page
Given the user is on the Home page
When the user opens the About dropdown
And selects the News option
Then News page should appear

Scenario: Navigate to Get in Touch from News main page
Given the user is on the News page
When the user clicks the Stay Updated button on News Page
Then the Get in Touch form should appear
