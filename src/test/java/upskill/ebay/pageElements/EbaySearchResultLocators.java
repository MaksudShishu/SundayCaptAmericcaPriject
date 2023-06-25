package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	
	//Search Laptop items from Ebay
		@FindBy(xpath="//span[2][contains(text(),'Laptop')]")
		public WebElement txtLaptop;
		
	//Search Iphone items from Ebay
		@FindBy(xpath="//span[2][contains(text(),'Iphone')]")
		public WebElement txtIphone;
		
	//Ebay Sign in 
		@FindBy(xpath="//button[text()='Hi ']")
		public WebElement textVerification;
		
		
	//Search Shoes items from Ebay
			@FindBy(xpath="//span[2][contains(text(),'Shoes')]")
			public WebElement txtShoes;
				
	//Search Shirt items from Ebay
			@FindBy(xpath="//span[2][contains(text(),'Shirt')]")
			public WebElement txtShirt;
				
	//Search Pant items from Ebay
			@FindBy(xpath="//span[2][contains(text(),'Pant')]")
			public WebElement txtPant;
				
	//Checkbox Brand Adidas
			@FindBy(xpath="//input[@aria-label='adidas']")
			public WebElement cbxBrandAdidas;
			
	//Checkbox Brand Nike
			@FindBy(xpath="//input[@aria-label='Nike']")
			public WebElement cbxBrandNike;
			
	//Checkbox Brand Unbranded
			@FindBy(xpath="//input[@aria-label='Unbranded']")
			public WebElement cbxBrandUnbranded;
	
	//EbayCart Shirt						//EbayCartDropDown
			@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without pockets. MADE IN USA')]")
			public WebElement linkShirtItems;
					
}
