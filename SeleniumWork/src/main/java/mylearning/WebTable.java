package mylearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://erail.in/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement stationFrom = driver.findElementById("txtStationFrom");
		stationFrom.clear();
		stationFrom.sendKeys("MAS");
		WebElement stationTo = driver.findElementById("txtStationTo");
		stationTo.clear();
		stationTo.sendKeys("MMCT");
		driver.findElementByXPath("//input[@title='Select Departure date for availability']").click();
		driver.findElementByXPath("(//table[@class='Month'])[1]/tbody/tr[7]/td[text()='26']").click();
		driver.findElementByXPath("//input[@value='Get Trains']").click();
		
		

	}

}
