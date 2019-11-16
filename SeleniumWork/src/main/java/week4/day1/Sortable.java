package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sortable {
	

	public static void main(String[] args) {
		RemoteWebDriver driver;
		
			System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
			
	
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement eleItem1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		eleItem1.getLocation();
		System.out.println(eleItem1.getLocation()); //(11, 8)
		
		WebElement eleItem4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		int x = eleItem4.getLocation().getX();
		int y = eleItem4.getLocation().getY();
		
		//System.out.println(eleItem4.getLocation());//(11, 130)
		
		
		Actions builder=new Actions(driver);
		
		//builder.dragAndDrop(eleItem1, eleItem4).perform();
		
		builder.dragAndDropBy(eleItem1, x, y).perform();
	
		
	}

}
