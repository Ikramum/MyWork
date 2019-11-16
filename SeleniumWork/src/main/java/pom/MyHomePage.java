package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyHomePage extends Annotations{
	
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	
	@FindBy(linkText="Lead")
	WebElement eleClickLeads;
	
	public CreateLead clickCreateLeads()
	{
		click(eleCreateLead);
		return new CreateLead();
	}
	
	
	public CreateLeadNeg clickCreateLeadNeg()
	{
		click(eleCreateLead);
		return new CreateLeadNeg();
	}
	
	public MyLeads clickLeads()
	{
		click(eleClickLeads);
		return new MyLeads();
	}
	

}
