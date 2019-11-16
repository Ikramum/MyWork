package week5.repots;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateLead {

	@Test
	public void createLead() throws IOException, InterruptedException{		
		//@BeforeSuite
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		//@BeforeTest -> setData 
		String testCasesName = "TC001";
		String testCasesDesc = "Create a new Lead in Leaftaps";
		
		//@BeforeClass
		ExtentTest suiteTest = extent.createTest(testCasesName, testCasesDesc);
		//@BeforeMethod
		ExtentTest test = suiteTest.createNode("Leads");//for each Row in DP
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//System.out.println("The browser: chrome launched successfully");
		test.pass("The browser: chrome launched successfully",  
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/createlead"+System.currentTimeMillis()+".png").build());
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//System.out.println("The username entered successfully with data - DemoSalesManager");
		test.fail("The username entered successfully with data - DemoSalesManager");
				
		
		driver.findElementById("password").sendKeys("crmsfa");
		//System.out.println("The password entered successfully with data - crmsfa");
		
		Thread.sleep(3000);
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("The Login button clicked");
		
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("The CRM/SFA link clicked");
		
		driver.findElementByLinkText("Create Lead").click();		
		System.out.println("The Create Lead link clicked");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/createlead"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(src, desc);
		//@AfterSuite
		extent.flush();
		
	}

}
