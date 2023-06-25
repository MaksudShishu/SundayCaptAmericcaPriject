package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {

	//Search Text Box		//For Ebay Homepage search textbox
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button			//For Ebay Homepage search button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	

	//My Ebay Link			//For EbaySummaryMouseHover
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement linkMyEbay;
			
	//Summary			//For EbaySummaryMouseHover
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
			 
}
