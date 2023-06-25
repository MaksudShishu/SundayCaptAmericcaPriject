package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {

	
	EbaySearchResultActions EbaySearchResultActionsobj=new EbaySearchResultActions();
	
	@Then("^Item list should have only Shoes related products$")
	public void item_list_should_have_only_Shoes_related_products() throws Throwable {
		EbaySearchResultActionsobj.verifyShoesItems();
		Thread.sleep(2000);
	}
	@Then("^Item list should have only Shirt related products$")
	public void item_list_should_have_only_Shirt_related_products() throws Throwable {
		EbaySearchResultActionsobj.veriftShirtItems();
	}
	@Then("^Item list should have only Laptop related products$")
	public void item_list_should_have_only_Laptop_related_products() throws Throwable {
		EbaySearchResultActionsobj.veriftLaptopItems();
	}
	@Then("^Item list should have only Iphone related products$")
	public void item_list_should_have_only_Iphone_related_products() throws Throwable {
		EbaySearchResultActionsobj.veriftIphoneItems();
	}

	@Then("^user should able to Sign in the homepage$")
	public void user_should_able_to_Sign_in_the_homepage() throws Throwable {
		EbaySearchResultActionsobj.verifySignIn();
	}

	@Then("^Item list should have only Pant related products$")
	public void item_list_should_have_only_Pant_related_products() throws Throwable {
		EbaySearchResultActionsobj.verifyPantItems();
}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsobj.filterBrand(brand);
		Thread.sleep(2000);

	}
	@Then("^Item list should have products of \"([^\"]*)\"$")	//([^\"]*)\"$")--Cucumber Regular Expression
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsobj.verifyBrandItems(brand);
		Thread.sleep(2000);
	}
											//EbayCartDropDown
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsobj.selectBigTallTee();
	}
}
