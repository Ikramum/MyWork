package week2.homework;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {

	public static void main(String[] args) {
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
		Select dropDown=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		List<WebElement> options = dropDown.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i=0;i<size;i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
		
		

	}

}
