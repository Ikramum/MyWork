package testcases;

import org.testng.annotations.Test;

import pom.MyHomePage;
import wdMethods.Annotations;

public class TC002_CreateLeads_neg extends Annotations{
	
	@Test(dataProvider="fetchData")
	
	public void createLead(String cName,String fName,String lName,String errMsg)
	{
		new MyHomePage()
		.clickCreateLeadNeg()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmitErr()
		.verifyErr(errMsg);
	}

}
