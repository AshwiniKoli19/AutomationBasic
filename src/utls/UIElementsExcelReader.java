package utls;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import ActionBot.UIElements;

public class UIElementsExcelReader 
{
	public static final String UIElementsExcelFilePath = "D:\\oxygen-workplace\\AutomationBasic\\src\\inputs\\UIElements.xlsx";
	
	public Map<String, UIElements> excelReaderMap() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Workbook workBook = WorkbookFactory.create(new File(UIElementsExcelFilePath));
		
		System.out.println(workBook.getNumberOfSheets());
		
		Sheet sheet = workBook.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		
		Iterator<Row> rowIterator = sheet.rowIterator();
		
		Map<String, UIElements> element = new HashMap<String, UIElements>();
		while(rowIterator.hasNext())
		{
			Row row =  rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				String key = formatter.formatCellValue(cell);
				String location = formatter.formatCellValue(cellIterator.next());
				String by = formatter.formatCellValue(cellIterator.next());
				UIElements ele = new UIElements();
				ele.setBy(by);
				ele.setKey(key);
				ele.setLocation(location);
				
				
				element.put(key, ele);
				 
				
//				display(element, "a");
				//element.put(cellValue, cell.)
				
				//System.out.println(cellValue + "\t");
			}
			//System.out.println("\n");
		}
		return(element);
		
	}
	
	/*public static void display(Map<String, UIElements> element, String key)
	{
		if(element.isEmpty())
		{
			System.out.println("lets do it.");
		}
		else
		{
			UIElements dis = element.get(key);
			System.out.println(dis.getKey());
			System.out.println(dis.getBy());
			System.out.println(dis.getLocation());
		
		}
		
	}
*/}
