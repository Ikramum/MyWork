package mylearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");

		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//get the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Locating elements
		//-----------------


	}

}
