package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.FlipKartHomePage;

public class TC001_LoginToFilpKart {
	
	@Test
	public void ClickLogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		FlipKartHomePage homepage=new FlipKartHomePage();
		homepage.clickLogin();
		
	}


		
		
		


}
