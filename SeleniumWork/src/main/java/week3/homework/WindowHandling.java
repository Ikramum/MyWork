package week3.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");

		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Launch the browser
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> setOfWinodwHandles = driver.getWindowHandles();
		
		List<String> listOfWindowHandles=new ArrayList<String>();
		
		listOfWindowHandles.addAll(setOfWinodwHandles);
		
		driver.switchTo().window(listOfWindowHandles.get(1));
		System.out.println("Second Window");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(driver.getTitle());
		
		
		
		driver.quit();
		
		System.out.println("Task Completed");
		



	}

}
