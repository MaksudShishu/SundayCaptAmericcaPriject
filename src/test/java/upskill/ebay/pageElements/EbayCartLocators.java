package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

	//Shirt Size type
	@FindBy(xpath="//select[@id='x-msku__select-box-1000']")
	public WebElement ddSizeType;
	
	//Shirt men type
	@FindBy(xpath="//select[@id='x-msku__select-box-1001']")
	public WebElement ddMenType;
				
	//Shirt Shade
	@FindBy(xpath="//select[@id='x-msku__select-box-1002']")
	public WebElement ddShade;
				
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement ddtbxQty;
				
	//Add to Cart
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement btnAddCart;
				
}
