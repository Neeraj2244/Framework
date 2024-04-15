package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider

{
	public XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File file = new File("/Users/niraj/Downloads/Data.xlsx");
		try 
		{
			FileInputStream fs = new FileInputStream(file);
			wb = new XSSFWorkbook(fs);
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to read the ExcelFile"+e.getMessage());
		
		}
	}
	
	
	public String ReadStringData(String FileName, int row , int column)
	{
		return wb.getSheet(FileName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	
	public String ReadStringAt(int index, int row , int column)
	{
		return wb.getSheetAt(index).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public double ReadNumericData(String FileName, int row , int column)
	{
		
		return wb.getSheet(FileName).getRow(row).getCell(column).getNumericCellValue();
	}
}


