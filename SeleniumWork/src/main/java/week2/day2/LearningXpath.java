package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) throws InterruptedException {
	

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
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		
	    Thread.sleep(3000);
		
		
		driver.findElementByXPath("//input[@id='ext-gen248']").sendKeys("Mohammed");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//ext-gen869
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//a[@id='ext-gen246']").sendKeys("10241");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		String errormsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(errormsg.equalsIgnoreCase("No records to display"))
		{
			System.out.println("Error message verified");
		}
		
		
		driver.close();

	}

}
