package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeads extends Annotations {
	
	public MyLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	
	public FindLeads clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeads();
		
	}

}
