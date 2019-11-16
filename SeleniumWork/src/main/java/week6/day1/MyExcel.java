package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcel {

	public static void main(String[] args) throws IOException {
		
		//Navigate to the Workbook
	
		XSSFWorkbook myWorkBook= new XSSFWorkbook("./data/TestExcel.xlsx");
		
		//Go to the sheet in the workbook
		
		XSSFSheet mySheet=myWorkBook.getSheet("TestSheet1");
		
		//Find the row count
		
		int rowCount = mySheet.getLastRowNum();//will count the rows from 0
		
		//Will return 0 if the sheet has 1 row or if the sheet is empty
		
		System.out.println(rowCount);
		
		//Find the Cell Count
		
		short cellCount = mySheet.getRow(0).getLastCellNum();
		
		System.out.println(cellCount);
		
		//Read the data
		
		//Create a two dimensional array
		
		String[][] readData=new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = mySheet.getRow(i);
		
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				String getXcelValue = cell.getStringCellValue();
				System.out.println(getXcelValue);
				
			}

		}
		

	}

}
