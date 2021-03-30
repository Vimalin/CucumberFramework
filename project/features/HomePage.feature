Feature: Google Search

@tag
Scenario: Search for Cucumber

Given I am on Google Search Home Page
When I input 'Cucumber' in Search bar
And click Google Search
Then Google will return results


#Given I am on Google Search Home Page
#When I input 'Cucumber' in Search bar
#And click Google Search
#Then Google will return results in less than 1 second