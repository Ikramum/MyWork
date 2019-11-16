package testcaseSe;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");

		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter username and password
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']/following::input").sendKeys("Mohammed");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//driver.findElementByLinkText("12331").click();
		driver.findElementByXPath("//span[text()='Lead List']/../../../../following::div/div/div/div/div/div/div/div/div/following::div/div/div/table/tbody/tr/td[1]/div/a").click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Title verified");
		}
		else
			System.out.println("Title not verified");
		
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeafs");
		driver.findElementByXPath("//input[@value='Update']").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		if(text.contains("TestLeafs"))
		System.out.println("Name change verified");
		else
			System.out.println("Name change not verified");
		

	}
	
	

}
