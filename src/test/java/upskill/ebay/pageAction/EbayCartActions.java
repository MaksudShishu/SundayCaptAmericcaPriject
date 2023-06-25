package upskill.ebay.pageAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj=new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	public void switchNewWindow(){  		//New Method-For new window(Window Handle)
	
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){   //For Loop
		SetupDrivers.driver.switchTo().window(winhandle);
	}
	}
	
	public void selectSizeType() throws Exception{
		//SetupDrivers.driver.get("https://www.ebay.com/itm/360479151409?var=630052081965&hash=item53ee3b5531:g:U8sAAOSwfVpYuRNL&amdata=enc%3AAQAIAAABICMT4Nkzxu3Kb30tDOvWMVdFxsyFA2sdIwlT2rOhI8rlC4RWbz6EWrKfDU3g0moqMDP3kLN7dea%2FY%2FlJeeVdOTCo%2BhnY0rRScsCzoYiYLLm2frdeeHgw85gbC9V7%2FBEBCTdxtpCsX8fZIfGD9UtAwWybXOEkKS%2FSCektEgkxWkYJNHfv2ONVRbziyOxvcIi0acE7OHHg%2F3Xed%2FFCu8U3JR6GDVgjhYViCiwZYJq2qY2C0PE8tPScX0zfHcIjHIW%2F4p9XpeDiaihcv1VAZo%2FeGVVrRrdPYVLdl4kLCr2nGXXC5iXoZ%2Be2NIJbHRpzLQDlW%2Fqa%2FVgg32UdEZn49D31EKG3zNC5P8%2FV6280e8%2B64QuriM5alfi4Bcnfw7gEW1N3FA%3D%3D%7Ctkp%3ABFBMjrX98odi");
		Thread.sleep(2000);
		Select dropDownObj=new Select(EbayCartLocatorsObj.ddSizeType);		
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		//	dropDownObj.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	
	public void selectMenSizeType() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj=new Select(EbayCartLocatorsObj.ddMenType);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
		//dropDownObj.selectByVisibleText("8XLT");
		//dropDownObj.selectByIndex(arg0);
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj=new Select(EbayCartLocatorsObj.ddShade);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
		//dropDownObj.selectByVisibleText("White");
		//dropDownObj.selectByIndex(5);
		//dropDownObj.selectByValue("5");
		Thread.sleep(2000);
	}
	
	public void enterQuantity() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.ddtbxQty.clear();
		EbayCartLocatorsObj.ddtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		//EbayCartLocatorsObj.ddtbxQty.sendKeys("2");
		Thread.sleep(2000);
		
	}
	
	public void addToCart() throws Exception {
		Thread.sleep(2000);
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
		
	}
}
