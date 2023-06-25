@regression @smoke @CA-03 @E2E
Feature: Ebay Search Functionality for Laptop

		Background:
		Given Open Ebay Homepage
		When Click search button
			
	Scenario: Search for Laptop
		When Search for Laptop
	  Then Item list should have only Laptop related products
		