package implementation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFlipKart {

	public WebDriver driver;


	@Given("Launch the Browser")
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("Start the FlipKart App")
	public void startFlipKartApp()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("Valid Credentials are entered")
	public void enterValidCredentials()
	{
		driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();;
	}

	@Then("Login the FlipKart App")
	public void loginFlipKArtApp() throws InterruptedException
	{
		
		System.out.println("SignupTabOpens");
	}


}
