package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelSheet {
	
	static int i;
	static int k;
	
	
	public static Workbook book;
	public static Sheet sheet;
	public static Object [][] readdata(String sheetname){
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\15192\\eclipse-workspace\\HRmanagement\\src\\test\\java\\testdata\\Details.xlsx");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException a) {
			
			a.printStackTrace();
		}
		 
		sheet = book.getSheet(sheetname);
		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (i=0; i<sheet.getLastRowNum(); i++) {
			for (k=0; k<sheet.getRow(0).getLastCellNum(); k++) {
				data [i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
			
		}
		
		return data;
	}
	
	

}
