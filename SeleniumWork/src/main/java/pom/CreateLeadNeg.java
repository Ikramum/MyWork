package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLeadNeg extends Annotations {
	

	public CreateLeadNeg()
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
	
	@FindBy(className="errorMessage")
	WebElement eleErrMsg;
	
	
	public CreateLeadNeg enterCompanyName(String cName)
	{ 
		type(eleCompanyName, cName);
		return this;

	}
	public CreateLeadNeg enterFirstName(String fName)
	{ 
		type(eleFirstName, fName);
		return this;

	}
	public CreateLeadNeg enterLastName(String lName)
	{ 
		type(eleLastName, lName);
		return this;

	}
	
	
	public CreateLeadNeg clickSubmitErr()
	{ 
		click(eleSubmit);
		return this;
	}
	public CreateLeadNeg verifyErr(String expectedText)
	{
		verifyPartialText(eleErrMsg, expectedText);
		return this;
	}
}
