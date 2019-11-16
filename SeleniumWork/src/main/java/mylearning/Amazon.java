package mylearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement helloSignIn = driver.findElementByXPath("//span[text()='Hello. Sign in']");
		
		WebElement signIn = driver.findElementByXPath("(//span[text()='Sign in'])[1]");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(helloSignIn).pause(3000).click(signIn).perform();
		
		driver.findElementByName("email").sendKeys("8015131915");
		driver.findElementById("continue").click();
		driver.findElementById("ap_password").sendKeys("8015131915",Keys.TAB);
		driver.findElementById("signInSubmit").click();
		
		String actualText = driver.getTitle();
		System.out.println(actualText);
		
//		String expectedText="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		
//	    Assert.assertEquals(expectedText,actualText);	
//	    
//	    System.out.println("True");
	    
	    File scr = driver.getScreenshotAs(OutputType.FILE);
	    File desc=new File("./snaps/amazon.png");
	    FileUtils.copyFile(scr, desc);
		

	}

}
