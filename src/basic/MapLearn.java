package basic;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import ActionBot.UIElements;
import sun.net.www.content.text.plain;
import utls.UIElementsExcelReader;

public class MapLearn {

	public void MapLearnPrgm() 
	{
		// TODO Auto-generated method stub

		Map<Integer, String> userDetails = new HashMap<Integer, String>();
		
		userDetails.put(1, "Ashwini");
		userDetails.put(2, "Archana");
		userDetails.put(3,"Divyani");
		
		System.out.println(userDetails.get(1));
		
		
		
	}
	
	public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		UIElementsExcelReader reader = new UIElementsExcelReader();
		
		Map<String, UIElements> myMap = reader.excelReaderMap();
		
		Iterator<Entry<String, UIElements>> itr = myMap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
			
		}
		
		
		
	}

}
