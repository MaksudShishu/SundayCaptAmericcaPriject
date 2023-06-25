package upskill.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;	//To intrigrated any kind of M/S-office file  We use apache.poi. (Rasel vi video CAP-46.00)

public class ReadExcelSheet {
	
	public static Map<String, Map<String, String>> setMapData() throws Exception{	/*Setter Method(Encaptulation)-It use for Returning the data
													(Map<String, Map<String, String>>)-Nasted HashMap //Here,Key(String) and Value(Map<String, String)*/
		
		String path = System.getProperty("user.dir")+"/src/test/resource/Datasheets/EbayDataSheet.xlsx";	//File Path for excel file.
		FileInputStream fis = new FileInputStream(path);			//Here Excel file is Physical	(V-47.00)	
		Workbook workbook = new XSSFWorkbook(fis);					//Here we have a directory of Excel file -Runtime virtual file	(Video-47.00)
		Sheet sheet = workbook.getSheetAt(0);						//Go to the 1st sheet to the Excel fill		
		int lastRow = sheet.getLastRowNum();						//Go to the Last Row to the Excel sheet
							//We are inputting the Excel File, then getting in to the work sheet and identifying the row(Line 20-24)-উপরের ৫ টি Row-তে
		
		Map<String, String> dataMap = new HashMap<String, String>();		//HashMap-Here,(Key-1st coloum(Key) of the Excel File & Value-2nd coloum(Value) of the Excel File)
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>(); //HashMap(Nasted)-Here, (Key-File Name of Excel File(e.g.Sheet1, Sheet2,Sheet3) & Value-First HashMap)
																			//Setting HashMap	-উপরের 2 টি Row-তে 
		
										//Now we need to Setting coloum & Rows 	-নিচের 8 টি Row-তে
		for (int i = 0; i<=lastRow; i++){					//Looping over entire row
			Row row = sheet.getRow(i);
			Cell keyCell = row.getCell(0); 					//0th cell as key
			Cell valueCell = row.getCell(1);				//1st cell as value
													
			
										//Now we need to Cleanning/Formating unwanted things e.g.Space or others -নিচের 3 টি Row-তে
			
			DataFormatter df = new DataFormatter();			//Cleaning up the data (by using a class which is called DataFormatter) 
			String key = df.formatCellValue(keyCell);		//For Cleanning/Formating unwanted data in the keyCell(1st coloum) 
			String value = df.formatCellValue(valueCell);	//For Cleanning/Formating unwanted data in the valueCell(2nd coloum)
			
						//Enter data -নিচের 2 টি Row-তে(Previous 2 HashMap)
			dataMap.put(key, value);						//Putting key & value in dataMap (1st HashMap)
			excelFileMap.put("EbayDataSheet", dataMap);		//Putting dataMap to excelFileMap (2nd HashMap)
		}
		
		return excelFileMap;								//Returning excelFileMap (Which we have set previous line by using SetterMethod)
	}
	
												//Now we need to getting data -নিচের 4 টি Row-তে     (Video-1.13)
	public static String getMapData(String key) throws Exception{	//Getter Method//(String key)-Method Parametter //It is also a Hashmap
		Map<String, String> m = setMapData().get("EbayDataSheet");	//
		String value = m.get(key); 		//We are passing the key
		return value;					//We are passing the value
	}
}