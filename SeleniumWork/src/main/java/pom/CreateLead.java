package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLead extends Annotations {
	

	public CreateLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;

	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;

	@FindBy(linkText="decorativeSubmit")
	WebElement eleSubmit;
	
	public CreateLead enterCompanyName(String cName)
	{ 
		type(eleCompanyName, cName);
		return this;

	}
	public CreateLead enterFirstName(String fName)
	{ 
		type(eleFirstName, fName);
		return this;

	}
	public CreateLead enterLastName(String lName)
	{ 
		type(eleLastName, lName);
		return this;
  
	}
	public ViewLeads clickSubmit()
	{ 
		click(eleSubmit);
		return new ViewLeads();
	}
	

}
