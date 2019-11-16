package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import wdMethods.Annotations;



public class ReadExcel extends Annotations {
	
	@Test
	//public  void readExcel() throws IOException
	//public  Object[][] readExcel(String fileName) throws IOException
	public  Object[][] readExcel(String fileName) throws IOException
	{
		//Go to Workbook
		//XSSFWorkbook wBook=new XSSFWorkbook("./data/login.xlsx");
		XSSFWorkbook wBook=new XSSFWorkbook("./data/"+fileName+ ".xlsx");
		//Go to Sheet
		//XSSFSheet sheet=wBook.getSheet("Login");
		XSSFSheet sheet=wBook.getSheetAt(0);
		//Find Row Count
		int rowCount = sheet.getLastRowNum();//will get the row count without header
		
		//int firstRowNum = sheet.getFirstRo wNum();
		//System.out.println(firstRowNum);
		
		//Find the Cell Count
		short cellCount = sheet.getRow(0).getLastCellNum();
		//Read the data
		
		Object[][] objData=new Object[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) 
		{
			XSSFRow row = sheet.getRow(i);
	
			for(int j=0;j<cellCount;j++) 
			{
				try {
					XSSFCell cell = row.getCell(j);

					//String data = cell.getStringCellValue();
					objData[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					objData[i-1][j]="";
				}
				//System.out.println(data);
			}
		}
		wBook.close();
		return objData;
		
			}
		}

