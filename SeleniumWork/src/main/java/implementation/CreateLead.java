package implementation;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public ChromeDriver driver;
	
	@Given("Open the Browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("Maximize the window")
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	@And("Load the URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set the Timeout")
	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the Username as (.*)")
	public void eneterUserName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);	
	}
	@And("Enter the Password as (.*)")
	public void eneterPpassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd,Keys.TAB);
	}
	@And("Click the Login button")
	public void clickLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click CRMSFA Link")
	public void clickCRMFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on Create Lead link")
	public void clickCreateLeadLink()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the Company Name as (.*)")
	public void enterCompanyName(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the FirstName as (.*)")
	public void eneterFirstName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		
	}
	
	@And("Enter the LastName as (.*)")
	public void eneterLastName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click on Submit button")
	public void clickSubmit()
	{
		driver.findElementByName("submitButton").click();

	}
	
	@Then("Verify new Lead is created successfully with the first name as(.*)")
	public void verifyCreationOfCreaeLead(String vName)
	{
       String expectedText = driver.findElementById("viewLead_firstName_sp").getText();
       if(vName==expectedText)
       {
    	   System.out.println("verified successfully");
       }
		
		
	}



}
