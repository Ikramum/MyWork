package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
		
		// Launching the browser
		ChromeDriver driver=new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//get the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Locating elements
		//-----------------
		
		//Locating text boxes
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Mohammed");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Ikramuddin");
		
		//Locating Radio buttons
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		//Locating dropdowns
		WebElement dob1 = driver.findElementById("userRegistrationForm:dobDay");
		Select day=new Select(dob1);
		day.selectByVisibleText("20");
		
		WebElement dob2 = driver.findElementById("userRegistrationForm:dobMonth");
		Select month=new Select(dob2);
		month.selectByIndex(11);
		
		WebElement dob3 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year=new Select(dob3);
		year.selectByValue("1992");
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occu=new Select(occupation);
		occu.selectByIndex(3);
		

		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select countr=new Select(country);
		countr.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("mohammed.ikram343@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8015131915");
		
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select natio=new Select(nationality);
		natio.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("No:13/1");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600048",Keys.TAB);
		
		Thread.sleep(3000);
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select cityName=new Select(city);
		cityName.selectByVisibleText("Kanchipuram");
		
		Thread.sleep(2000);
		
		WebElement post=driver.findElementById("userRegistrationForm:postofficeName");
		Select postOff=new Select(post);
        postOff.selectByValue("Vandalur S.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("8015131915");
		boolean selected = driver.findElementById("userRegistrationForm:resAndOff:0").isSelected();
		System.out.println(selected);
		System.out.println("Task Completed");
	}

}
