package week2.homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2_EditLead {

	public static void main(String[] args) {
		
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

	}

}
