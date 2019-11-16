package testcaseSe;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_CreateContactSe extends SeMethod {
	
	@Test
	public void createContactTest() throws InterruptedException {
	
		startApp("Chrome", "http://leaftaps.com/opentaps/");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword,"crmsfa");
		
		Thread.sleep(3000);
		
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCreateLink = locateElement("xpath","//*[@id='label']/a");
		click(eleCreateLink);
		
		WebElement elecCreateContactLinK = locateElement("link", "Create Contact");
		click(elecCreateContactLinK);
		
		WebElement eleFirstName = locateElement("id", "firstNameField");
		type(eleFirstName,"Mohammed");
		
		WebElement eleLastName = locateElement("id", "lastNameField");
		type(eleLastName,"Ikramuddin");
		WebElement eleLocalFN = locateElement("id", "createContactForm_firstNameLocal");
		type(eleLocalFN,"Mohed");
		WebElement eleLocalLN = locateElement("id", "createContactForm_lastNameLocal");
		type(eleLocalLN,"Ikram");
		
		//Contact details
	
		WebElement elePersonTitle = locateElement("id", "createContactForm_personalTitle");
		type(elePersonTitle,"crmsfa");
		WebElement eleDOB = locateElement("id", "createContactForm_birthDate");
		type(eleDOB,"12/20/92");
		WebElement eleProfileTitle = locateElement("id", "createContactForm_generalProfTitle");
		type(eleProfileTitle,"MR");
		
		WebElement eleDeptName = locateElement("id", "createContactForm_departmentName");
		type(eleDeptName,"IT");
		
		WebElement eleCurrency = locateElement("id", "createContactForm_preferredCurrencyUomId");
		selectDropDownUsingValue(eleCurrency,"INR");
		
		
		
		WebElement eleContactNum = locateElement("id", "createContactForm_accountPartyId");
		type(eleContactNum,"234567");
		
		WebElement eleContactDesc = locateElement("id", "createContactForm_description");
		type(eleContactDesc,"Project");
		
		WebElement eleContactNote = locateElement("id", "createContactForm_importantNote");
		type(eleContactNote,"TestLeaf");
		
		WebElement eleMobCode = locateElement("id", "createContactForm_primaryPhoneAreaCode");
		type(eleMobCode,"044");
		
		WebElement  eleContactMobNum= locateElement("id", "createContactForm_primaryPhoneNumber");
		type(eleContactMobNum,"8765432190");
		
		WebElement  eleContactMobExte= locateElement("id", "createContactForm_primaryPhoneExtension");
		type(eleContactMobExte,"7863");
		
		WebElement  eleContactEmail= locateElement("id", "createContactForm_primaryEmail");
		type(eleContactEmail,"mohammed.ikrame343@gmail.com");
		
		WebElement  eleContactMobName= locateElement("id", "createContactForm_primaryPhoneAskForName");
		type(eleContactMobName,"Ikram");
		
				
		WebElement  eleToNameText= locateElement("id", "generalToNameField");
		
		String toNameText=getAttibuteValue(eleToNameText, "value");
		
		WebElement  eleContactAttnNsme= locateElement("id", "createContactForm_generalAttnName");
		type(eleContactAttnNsme,"Ikram");
		WebElement  eleContactAddressLine1= locateElement("id", "createContactForm_generalAddress1");
		type(eleContactAddressLine1,"No 17 sdhfgd");
		
		WebElement  eleContactAddressLine2= locateElement("id", "createContactForm_generalAddress2");
		type(eleContactAddressLine2,"test");
		
		WebElement  eleContactCity= locateElement("id", "createContactForm_generalCity");
		type(eleContactCity,"Chennai");
		
		WebElement  eleContactCountry= locateElement("id", "createContactForm_generalCountryGeoId");
		selectDropDownUsingValue(eleContactCountry,"IND");
		
		WebElement  eleContactState= locateElement("id", "createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingValue(eleContactState,"IN-TN");
		
		WebElement  eleContactZip= locateElement("id", "createContactForm_generalPostalCode");
		type(eleContactZip,"23456");
		
		WebElement  eleContactZipExt= locateElement("id", "createContactForm_generalPostalCodeExt");
		type(eleContactZipExt,"7890");
		
		WebElement  eleContactsubmit= locateElement("name", "submitButton");
		click(eleContactsubmit);
		
		WebElement  eleContactFN= locateElement("id", "viewContact_firstName_sp");
		
		verifyPartialText(eleContactFN,toNameText);
		
		WebElement  eleContactEdit= locateElement("link", "Edit");
		click(eleContactEdit);
		
		WebElement selectCampaign =locateElement("id", "addMarketingCampaignForm_marketingCampaignId");
		String expectedText= getSelectedDropdownValueUsingValue(selectCampaign,"Demo Marketing Campaign");
		
		
		
		WebElement  eleCamPaignAdd= locateElement("xpath", "//input[@value='Add']");
		click(eleCamPaignAdd);
		WebElement  eleContactUpdate= locateElement("xpath", "//input[@value='Update']");
		click(eleContactUpdate);
		
		
		
		WebElement  elecampaignText= locateElement("id", "viewContact_marketingCampaigns_sp");
		
		
		verifyExactText(elecampaignText,expectedText );

	}

}
