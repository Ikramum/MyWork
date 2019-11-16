package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class Annotations extends SeMethods {

	public  String excelFileName,testName,testDesc,category,author,moduleName;

	@BeforeSuite
	public void startSuite()
	{
		beginResult();
	}

	@BeforeClass
	public void startTest() {
		startTest(testName, testDesc);
	}

	@Parameters({"url","uName","pwd"})
	//@BeforeMethod
	@BeforeMethod(groups= {"smoke","sanity"})
	public void login(String url,String uName,String pwd) throws InterruptedException
	{
		startTestIteration(moduleName, author, category);

		/*startApp("Chrome", "http://leaftaps.com/opentaps/");*/
		startApp("Chrome", url);


		WebElement eleUserName = locateElement("id", "username");
		/*type(eleUserName,"DemoSalesManager");*/
		type(eleUserName,uName);

		WebElement elePassword = locateElement("id", "password");
		/*type(elePassword,"crmsfa");*/
		type(elePassword,pwd);

		Thread.sleep(3000);

		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		Thread.sleep(3000);


		WebElement eleCrmsfa = locateElement("link","CRM/SFA");
		click(eleCrmsfa);

	}
 
	@DataProvider(name="fetchData", indices= {0})
	//public Object[][] getData() throws IOException
	public Object[][] getData() throws IOException
	{
		ReadExcel objReadexcel=new ReadExcel();
		//return objReadexcel.readExcel("createlead");
		return objReadexcel.readExcel(excelFileName);

	}
		//@AfterMethod
		@AfterMethod(groups= {"smoke","sanity"})
		public void closeBrowserApp()
		{
			closeBrowser();
		}

		@AfterSuite
		public void stopSuite()
		{
			endResult();
		}


	}

