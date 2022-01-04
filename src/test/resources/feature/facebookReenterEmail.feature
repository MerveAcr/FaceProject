@email
Feature: reenter email check
Scenario: : Verify reenter email label
	Given user on signin page
	When user click create new account button
	And user fill firstname field as a "Steve"
	And user fill lastname field as a "Jobs"
	And user fill email field as "sjobs@apple.com"
	Then useer able to see reenter enmail label
