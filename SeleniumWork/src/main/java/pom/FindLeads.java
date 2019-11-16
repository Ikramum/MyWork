package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class FindLeads extends Annotations {
	
	public FindLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='id']/following::input")
	WebElement eleFirstName;
	
	@FindBy(xpath="Find Leads")
	WebElement eleFindLeadsBtn;
	
	@FindBy(xpath="//span[text()='Lead List']/../../../../following::div/div/div/div/div/div/div/div/div/following::div/div/div/table/tbody/tr/td[1]/div/a")
	WebElement eleFirstLink;
	
	public FindLeads enterFirstName(String fName)
	{
		type(eleFirstName, fName);
		
		return this;
	}
	public FindLeads clickFindLeadsBtn()
	{
		click(eleFindLeadsBtn);
		return this;
	}
	
	public ViewLeads clickFirstLink()
	{
		click(eleFirstLink);
		return new ViewLeads();
	
	}

}
