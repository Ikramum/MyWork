package mylearning;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {
	
	@Test(groups= {"smoke"})

	public void createLead() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mohammed");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ikramuddin");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select src=new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select markcamp=new Select(marketingCampaign);
		markcamp.selectByVisibleText("eCommerce Site Internal Campaign");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Mohammed");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ikramuddin");
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_birthDate").sendKeys("12/20/92");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("99999999");
		WebElement Currency = driver.findElementById("createLeadForm_currencyUomId");
		Select curr=new Select(Currency);
		curr.selectByValue("INR");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select inds=new Select(industry);
		inds.selectByValue("IND_SOFTWARE");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("500");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownshp=new Select(ownership);
		ownshp.selectByValue("OWN_PROPRIETOR");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("12345");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("000");
		
		driver.findElementById("createLeadForm_description").sendKeys("Test");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Test");
		
		//Contact Information
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("22334455");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("+044");
		
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Ikram");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("mohammed.ikram343@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://testleaf.com");
		
		//Primary Address
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("Ikram");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select cnty=new Select(country);
		cnty.selectByValue("IND");
		
		Thread.sleep(1000);
		
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select st=new Select(state);
		st.selectByValue("IN-TN");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600048");
		driver.findElementByName("submitButton").click();
		
		//verify
		
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		assertEquals("Mohammed", firstName);
		System.out.println("Entered First Name is correct");

	}

}
