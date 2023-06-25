package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {

	EbayHomepageActions EbayHomepageActionsobj=new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")		//For Ebay Homepage
	public void open_Ebay_Homepage() throws Throwable {
	   Thread.sleep(2000);
	}
	@When("^Search for Shoes$")			//For Ebay Shoes
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsobj.searchShoes();
		Thread.sleep(2000);
	}
	@When("^Search for Shirt$")			//For Ebay Shirt
	public void search_for_Shirt() throws Throwable {
		EbayHomepageActionsobj.searchShirt();
	}
	@When("^Click search button$")		//For Ebay Search Button
	public void click_search_button() throws Throwable {
		EbayHomepageActionsobj.searchButton();
	}
	@When("^Search for Laptop$")		//For Ebay Laptop
	public void search_for_Laptop() throws Throwable {
		EbayHomepageActionsobj.searchLaptop();
	}
	@When("^Search for Iphone$")		//For Ebay Iphone
	public void search_for_Iphone() throws Throwable {
		EbayHomepageActionsobj.searchIphone();
	}
	@When("^Search for Pant$")			//For Ebay Pant
	public void search_for_Pant() throws Throwable {
		EbayHomepageActionsobj.searchPant();
}
										//For(Senerio outline)
	@Given("^Search for \"([^\"]*)\"$")	//([^\"]*)\"$")--Cucumber Regular Expression
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsobj.searchItems(items);
		Thread.sleep(2000);
	}
										//EbayCartDropDown
	@Given("^Search for Big Tall Cotton Tee Made USA$")
	public void search_for_Big_Tall_Cotton_Tee_Made_USA() throws Throwable {
		EbayHomepageActionsobj.searchItems("Big Tall Cotton Tee Made USA");
	}
										//EbaySummaryMouseHover
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsobj.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsobj.clickSummery();
	
	}
}