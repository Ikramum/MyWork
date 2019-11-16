package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

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
		driver.findElementById("tryhome");
		
		System.out.println("Task Completed");
		
		driver.close();
		


	}

}
