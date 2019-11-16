package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLeads extends Annotations{
	
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="createlead";
		testName="Create Lead";
		testDesc="Create a new Lead";
		category="sanity";
		author="Ikram";
		moduleName="Leads";
	}
	
	@Test(dataProvider="fetchData")
	
	public void createLead(String cName,String fName,String lName)
	{
		new MyHomePage()
		.clickCreateLeads()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);
	}

}
