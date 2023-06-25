package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomepageActions(){						//Constractor of class "public class EbayHomepageActions"
		EbayHomepageLocatorsObj=new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
		}
	public void searchShoes(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	public void searchShirt(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shirt");	
	}
	public void searchButton(){
		EbayHomepageLocatorsObj.btnSearch.click();
		
	}
	public void searchLaptop(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Laptop");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	public void searchIphone(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Iphone");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	public void searchPant(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Pant");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
													//For(Senerio outline)		//EbayCartDropDown
	public void searchItems(String items){  		//(Method parameter)
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(items);	
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);	//Explicit Wait
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
		//EbayHomepageLocatorsObj.btnSearch.click();
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);		//(oops Concept-Polymorphism(Method Overloding))
	}
													
											//For EbaySummaryMouseHover
public void mouseHoverMyEbay() throws Exception{
		
		Actions actions=new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);
	}
public void clickSummery() throws Exception{
		EbayHomepageLocatorsObj.linkSummary.isEnabled();
		EbayHomepageLocatorsObj.linkSummary.click();
		Thread.sleep(3000);
	
	}
		//Selenium Wait
public void synchronization(){
	/*	Selenium Wait : 
			1. Implicit wait(Global), 
			2. Explicit wait(Conditional), 
			3. Fluent wait(intermittent) */
		
	//Implicit Wait
	SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//NoSuchElemente
	
	//Explicit Wait
	WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
	explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
	//ElementNotVisiable
	
	//Fluent Wait
	FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
	fluentWait.withTimeout(10, TimeUnit.SECONDS);
	fluentWait.pollingEvery(2, TimeUnit.SECONDS);
	//ElementNotVisible
}

public void keyboardKeys(){
	EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
	EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.UP);
	EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
	EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.CLEAR);
	EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DELETE);
	}
	//To handle pop up window/Allert
public void handleAlert(){
	SetupDrivers.driver.switchTo().alert().accept();
	SetupDrivers.driver.switchTo().alert().dismiss();
	SetupDrivers.driver.switchTo().alert().getText();
	SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
}
public void javaScriptExecutor(){
	
	JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;	//Creating JS object
	
	js.executeScript("");
	
	js.executeScript("EbayHomePageLocatorsObj.btnSearch.click();"); //Clicking on element
	
	js.executeScript("EbayHomePageLocatorsObj.txtbxSearch.value ='shirt';"); //Writing something
	
	js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
	
	js.executeScript("window.location = 'http://upskill.com';"); // initializing location
	
	js.executeScript("location.reload()"); 						//Refresh browser
	
	js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsObj.btnSearch);  //Scroll to a object
	
	js.executeScript("alert('Confirmation');");					//Alert
	
	js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
	
	js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
	

}
}




