package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
		}
	
	public void verifyShoesItems(){
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	public void veriftShirtItems(){			//For Ebay Shirt
		EbaySearchResultLocatorsObj.txtShirt.isDisplayed();
	}
	public void veriftLaptopItems(){		//For Ebay Laptop
		EbaySearchResultLocatorsObj.txtLaptop.isDisplayed();
	}
	public void veriftIphoneItems(){		//For Ebay Iphone
		EbaySearchResultLocatorsObj.txtIphone.isDisplayed();
	}
	public void verifySignIn(){				//For SignIn
		EbaySearchResultLocatorsObj.textVerification.isDisplayed();
	}
	public void verifyPantItems(){			//For Ebay Pant
		EbaySearchResultLocatorsObj.txtPant.isDisplayed();
	}
											//For(Senerio outline)
	public void filterBrand(String brand){  
		if(brand.equals("Adidas")){
		EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	}else if(brand.equals("Nike")){
		EbaySearchResultLocatorsObj.cbxBrandNike.click();
	}else if(brand.equals("Unbranded")){
		EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
	}else{
		System.out.println("Brand not found");
	}
}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirt.isDisplayed());
	}else if(brand.equals("Nike")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}else if(brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPant.isDisplayed());
	}else{
		System.out.println("Brand not found");
	}
}
									//EbayCartDropDown
	public void selectBigTallTee() throws Exception{
		Thread.sleep(3000);
		EbaySearchResultLocatorsObj.linkShirtItems.click();
		Thread.sleep(3000);
	}
	
}