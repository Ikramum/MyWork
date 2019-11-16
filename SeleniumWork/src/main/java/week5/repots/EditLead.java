package week5.repots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class EditLead {
	
	@Test
	
	public void editLead() throws InterruptedException, IOException
	{
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		String testCaseName="TC002";
		String testDesc=" Edit Leads in Leaftabs";
		
		ExtentTest suiteTest = extent.createTest(testCaseName, testDesc);
		ExtentTest test = suiteTest.createNode("Edit");
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");

		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter username and password
		test.pass("The browser: chrome launched successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/editLead.png").build());
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']/following::input").sendKeys("Mohammed");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//driver.findElementByLinkText("12331").click();
		driver.findElementByXPath("//span[text()='Lead List']/../../../../following::div/div/div/div/div/div/div/div/div/following::div/div/div/table/tbody/tr/td[1]/div/a").click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Title verified");
		}
		else
			System.out.println("Title not verified");
		
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeafs");
		driver.findElementByXPath("//input[@value='Update']").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		if(text.contains("TestLeafs"))
		System.out.println("Name change verified");
		else
			System.out.println("Name change not verified");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/editLead.png");
		FileUtils.copyFile(src, desc);
		extent.flush();
		
		
		

		
		
		
		
	}

}
