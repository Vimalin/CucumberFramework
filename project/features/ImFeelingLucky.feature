Feature: I am Feeling Lucky

Scenario: Enter java and click Im Feeling Lucky

Given I am on Google home search page
When I enter Java in the search bar 
And I click Im Feeling Lucky
Then I should be directed straight to the Java.com website

Scenario: View privacy policy

Given I am on Google home search page
When I click on Privacy
Then I should be directed to the Privacy page