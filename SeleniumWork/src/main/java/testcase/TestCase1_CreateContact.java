package testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1_CreateContact {

	public static void main (String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
        // Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter User name and password
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Contact").click();
		
		driver.findElementById("firstNameField").sendKeys("Mohammed");
		driver.findElementById("lastNameField").sendKeys("Ikramuddin");
		
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Mohd");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Ikram");
		
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createContactForm_birthDate").sendKeys("12/20/92");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("MR");
		driver.findElementById("createContactForm_departmentName").sendKeys("IT");
		
		WebElement selectCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select currency=new Select(selectCurrency);
		currency.selectByValue("INR");
		driver.findElementById("createContactForm_accountPartyId").sendKeys("77777");
		driver.findElementById("createContactForm_description").sendKeys("Project");
		driver.findElementById("createContactForm_importantNote").sendKeys("Testleaf");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("5678");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("22334455");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("mohammed.ikrame343@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Ikram");
		String toNameText = driver.findElementById("generalToNameField").getAttribute("value");
		System.out.println(toNameText);
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Ikram");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("No:1");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("test");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		WebElement selectCountry = driver.findElementById("createContactForm_generalCountryGeoId");
		Select country=new Select(selectCountry);
		country.selectByValue("IND");
		
		Thread.sleep(3000);
		
		WebElement selectState = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select state=new Select(selectState);
		state.selectByValue("IN-TN");
		
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600048");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("12345");
		driver.findElementByName("submitButton").click();
		
		String firstName = driver.findElementById("viewContact_firstName_sp").getText();
		
		if(toNameText.contains(firstName))
		{
			System.out.println("Name Matches");
		}
		else
		{
			System.out.println("Name does not match");
			
		}
		driver.findElementByLinkText("Edit").click();
		
		WebElement selectCampaign = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select campaign=new Select(selectCampaign);
		campaign.selectByValue("DEMO_MKTG_CAMP");
		String sd=campaign.getFirstSelectedOption().getText();
		
		driver.findElementByXPath("//input[@value='Add']").click();
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String campaignText = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		
		if	(sd.equals(campaignText))
		{
			System.out.println("Text Verified");
		}
		else
		{
			System.out.println("Text not verified");
		}

	}

}
