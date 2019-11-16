package testngwork;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations{

	/*@Test()*/
	/*@Test(invocationCount=2)*/
	/*@Test(timeOut=5000)*/
	/*@Test(groups= {"sanity"})*/
	
	@Test(dataProvider="fetchData",groups= {"sanity"})
	public void createLead(String cName,String fName,String lName) throws InterruptedException {
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		Thread.sleep(3000);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);*/
		
		WebElement eleCRM = locateElement("link","CRM/SFA");
		click(eleCRM);
		WebElement eleCreateLead = locateElement("link","Create Lead");
		click(eleCreateLead);
		WebElement eleCompanyName = locateElement("createLeadForm_companyName");
		/*type(eleCompanyName,"TestLeaf");*/
		type(eleCompanyName,cName);
		WebElement eleFirstName = locateElement("createLeadForm_firstName");
		/*type(eleFirstName,"Mohammed");*/
		type(eleFirstName,fName);
		WebElement eleLastName = locateElement("createLeadForm_lastName");
		/*type(eleLastName,"Ikramuddin");*/
		type(eleLastName,lName);
		/*WebElement dataSourc = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(dataSourc, "LEAD_EMPLOYEE");
		*/
	
		
	}
	
	@DataProvider(name="fetchData")
	/*@DataProvider(name="fetchData",indices= {1})*/// to specify which set of data to be passed, index starts with '0'
	public String[][] getData()
	{
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Mohammed";
		data[0][2]="Ikramuddin";
		
		data[1][0]="TestLeaf";
		data[1][1]="UV";
		data[1][2]="Yuvaraj";	
		
		return data;
		
	}
}
