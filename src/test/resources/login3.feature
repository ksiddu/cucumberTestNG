@login 
Feature: Third Login Feature

Scenario: Successful e-commerce(automationpractice.com) Login 
	Given I go to e-commerce login page 
	When I login with valid credentials 
	Then Verify the home page 