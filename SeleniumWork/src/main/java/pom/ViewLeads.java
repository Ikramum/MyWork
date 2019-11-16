package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeads extends Annotations {

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerifyFirstName;
	
	@FindBy(linkText="Edit")
	WebElement eleEditBtn;
	
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleCompanyName;
	
	
	public ViewLeads verifyFirstName(String vText)
	{
		verifyExactText(eleVerifyFirstName, vText);
		return this;
	}
	
	public ViewLeads verifyPageTitle()
	
	{
		String pageTitle1 = driver.getTitle();
		verifyTitle(pageTitle1);
		return this;
	}
	
	public OpenTabs clickEditBtn()
	{
		click(eleEditBtn);
		return new OpenTabs();
	}
	
	public ViewLeads verifyComapnyName(String cName)
	{
		verifyExactText(eleCompanyName, cName);
		return this;
	}
}
