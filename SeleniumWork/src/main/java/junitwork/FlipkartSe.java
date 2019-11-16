package junitwork;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class FlipkartSe extends SeMethods {
	
	@Test
	//@Test(enabled=false) for testng
	
	public void flipKartTest() throws InterruptedException
	{
		
	startApp("chrome", "https://www.flipkart.com/");

	WebElement eleX = locateElement("xpath","//*[text()='✕']");
	click(eleX);
	
	
	WebElement eleTVApp = locateElement("xpath", "//*[text()='TVs & Appliances']");
	
	WebElement eleTVSamsung = locateElement("xpath","//span[text()='Vu']/following::span[text()='Samsung']");
	
	moveToElement(eleTVApp, eleTVSamsung);
	
	WebElement eleMinPrice = locateElement("xpath", "(//select[@class='fPjUPw'])[1]");
	
	selectDropDownUsingValue(eleMinPrice, "25000");
	
	WebElement eleMaxPrice = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
	
	selectDropDownUsingValue(eleMaxPrice, "60000");
	
	Thread.sleep(3000);
	
	WebElement screenSize = locateElement("xpath", "//div[text()='Screen Size']");
	click(screenSize);
	
	WebElement screenSizeValue = locateElement("xpath", "//div[text()='48 - 55']");
	click(screenSizeValue);
	
	Thread.sleep(3000);
	
	WebElement selectTV1 = locateElement("xpath", "(//div[@class='_3wU53n'])[1]");
	click(selectTV1);
	
	switchToWindow(1);
	WebElement clickCompare = locateElement("xpath", "//div[@class='_1p7h2j']");
	click(clickCompare);
	
	closeBrowser();
	
	switchToWindow(0);
	Thread.sleep(3000);
	
	WebElement selectTv2 = locateElement("xpath", "(//div[@class='_3wU53n'])[2]");
	click(selectTv2);
	
	switchToWindow(1);
	WebElement clickCompare1 = locateElement("xpath", "//div[@class='_1p7h2j']");
	click(clickCompare1);
	
	WebElement sampleclick = locateElement("xpath", "//span[text()='COMPARE']");
	click(sampleclick);

	Thread.sleep(3000);
	
	WebElement price1 = locateElement("xpath", "(//div[@class='_1vC4OE'])[1]");
	
	String priceOfProd1 = getText(price1);
	priceOfProd1= priceOfProd1.substring(1).replace(",","");
	
	int intValueOfProd1 = conversionOfStringTOInt(priceOfProd1);
	
	Thread.sleep(3000);
	
	WebElement price2 = locateElement("xpath", "(//div[@class='_1vC4OE'])[2]");
	
	String priceOfProd2 = getText(price2);
	priceOfProd2= priceOfProd2.substring(1).replace(",","");
	
	int intValueOfProd2 = conversionOfStringTOInt(priceOfProd2);
	
	WebElement eleBuyNow1 =locateElement("xpath","(//button[text()='BUY NOW'])[1]");
	WebElement eleBuyNow2 =locateElement("xpath","(//button[text()='BUY NOW'])[2]");

	
	if ( intValueOfProd1>intValueOfProd2 )
	{
		click(eleBuyNow2);
	}
	else
	{
		click(eleBuyNow1);
	}
		
	
	}
	

}
