package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MoveToElement {
	

	public static void main(String[] args) {
		RemoteWebDriver driver;
		
			System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
			
	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[text()='✕']").click();
		
		WebElement eleTV = driver.findElementByXPath("//*[text()='TVs & Appliances']");
		
		WebElement eleThomson = driver.findElementByXPath("//*[text()='Thomson']");

		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(eleTV).pause(2000).click(eleThomson).perform();
		
		
	}

}
