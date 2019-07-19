Feature: Search and Place order for Veg
@autoTest
Scenario: Search for items and Validate results
Given user is on Greencart landpage
When user serach for "Cucumber" Veg
Then "Cucumber" results are displayed


