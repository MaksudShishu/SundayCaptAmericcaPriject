package upskill.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {
	
	public void screenshots() throws Exception{				//New Method
		
		String filename = "Ebay "; 							//File Name(Which file do we work)
		
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy h-m-s");			//Date Formate
		Date date = new Date();											
		
		File screenshot = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.FILE); //How we store the screenshort(Is it file or any other)
		
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/screenshots/"+filename+dateFormat.format(date)+".png"));	
		
		System.out.println(">>>>>>>> Screenshot Taken >>>>>>>>");
	}
}