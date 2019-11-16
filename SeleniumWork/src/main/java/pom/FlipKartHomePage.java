package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipKartHomePage {
	
	WebDriver driver;
	
    By login=By.xpath("//a[text()='Login & Signup']");
    
    /*public FlipKartHomePage(WebDriver driver)
	
    {
    	this.driver=driver;
    }*/
    
    public void clickLogin()
    {
    	driver.findElement(login).click();
    }

}
