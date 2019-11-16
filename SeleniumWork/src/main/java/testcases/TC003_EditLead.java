package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.MyHomePage;
import wdMethods.Annotations;

public class TC003_EditLead extends Annotations {
	
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="editlead";
		testName="Edit Lead";
		testDesc="Edit the existing lead";
		category="sanity";
		author="Ikram";
		moduleName="Leads";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String fName,String cName)
	{
	
	new MyHomePage()
	.clickLeads()
	.clickFindLeads()
	.enterFirstName(fName)
	.clickFindLeadsBtn()
	.clickFirstLink()
	.verifyPageTitle()
	.clickEditBtn()
	.clearCompanyName()
	.editCompanyName(cName)
	.clickUpdateBtn()
	.verifyComapnyName(cName);
	
	}
}
