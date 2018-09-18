Feature: Test feature

@test1
Scenario:  Test Scenario
	Given I navigate to the browser homepage
	Then I enter google search link
	Then I should see the google search box
    When I enter "palani" in search box
    Then I should see the search results