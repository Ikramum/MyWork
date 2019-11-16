package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");

		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Launch the browser
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		
		Alert myAlerts = driver.switchTo().alert();
		
		myAlerts.sendKeys("Ikram");
		myAlerts.getText();
		System.out.println(myAlerts.getText());
		myAlerts.accept();
		
		String text = driver.findElementById("demo").getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		
		Set<String> setOfWinodwHandles = driver.getWindowHandles();
		
		List<String> listOfWindowHandles=new ArrayList<String>();
		
		listOfWindowHandles.addAll(setOfWinodwHandles);
		
		driver.switchTo().window(listOfWindowHandles.get(1));
		System.out.println("Second Window");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(driver.getTitle());
		
		
		System.out.println("First Window");

		driver.switchTo().window(listOfWindowHandles.get(0));
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		System.out.println(driver.getTitle());
		
		
		
		driver.quit();
		
		System.out.println("Task Completed");
		


	}

}
