@regression @smoke @CA-04 @E2E
Feature: Ebay Search Functionality for Iphone

		Background:
		Given Open Ebay Homepage
		When Click search button
			
	Scenario: Search for Iphone
		When Search for Iphone
	  Then Item list should have only Iphone related products
		