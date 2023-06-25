@regression @smoke @CA-06 @E2E
Feature: Ebay Search Functionality for Pant

		Background:
		Given Open Ebay Homepage
	
	Scenario: Search for Pant
		When Search for Pant
		And Click search button
		Then Item list should have only Pant related products
		