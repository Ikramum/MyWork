package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DragAndDrop {
	

	public static void main(String[] args) {
		RemoteWebDriver driver;
		
			System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
			
	
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement eledraggable = driver.findElementById("draggable");
		
		WebElement eledroppable = driver.findElementById("droppable");

		
		Actions builder=new Actions(driver);
		
		builder.dragAndDrop(eledraggable, eledroppable).perform();
		
		
	}

}
