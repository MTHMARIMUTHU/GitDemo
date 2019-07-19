Feature:  Application login 

Background:
Given Validate the Browser
When Broswer is opened
Then Browser page should display


@Regtest
Scenario: Home page default login
Given User is on Landing page
When User login with application user name  password
Then Home page is populated  
And All credit cards should be displayed

@Regtest
Scenario: Home page default login
Given User is on Landing page
When User login with application user name "Marim" and password "2345"
Then Home page is populated  
And All credit cards should not be displayed

@Regtest
Scenario: Home page default login
Given User is on Landing page
When User login details enter
|Jenny | abcd | India |marimuthu@gmail.com | 5512635706 |
Then Home page is populated  
And All credit cards should be displayed


@SanityTest
Scenario Outline: Home page default login
Given User is on Landing page
When User login  application <Username> and password <password>
Then Home page is populated  
And All credit cards should be displayed

Examples:
|Username |password|
|user1    |pass1|
|user2    |pass2|
|user3    |pass3|
|user4    |pass2|

