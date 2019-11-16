package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class OpenTabs extends Annotations{
	
	public OpenTabs()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleUpdateBtn;
	
	public OpenTabs clearCompanyName()
	{
		clear(eleCompanyName);
		return this;
		
	}
	public OpenTabs editCompanyName(String cName)
	{
		type(eleCompanyName, cName);
		return this;

	}
	
	public ViewLeads clickUpdateBtn()
	
	{
		click(eleUpdateBtn);
		return new ViewLeads();
	}

}
