package testcaseSe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.WdMethods;

public class SeMethod implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\workspace\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is Launched Successfully");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println(" Webdriver exception occured ");
			
		}
		catch (Exception e) {
			System.err.println(" Unable to launch the browser ");
			
		}

		finally {
			takeSnap();

		}
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "link": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			case "tagname": return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e) {
		 System.err.println(" The Element is not found");
			
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println(" The is not available currently");
			
		}
		catch(Exception e)
		{
			System.err.println(" Exception has occured ");
			
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} catch (WebDriverException e) {

			System.err.println("WebDriver execptionhas occurred");

		}
		finally {

			takeSnap();	
		}

	}

	public void click(WebElement ele) {

		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();	

	}

	public String getText(WebElement ele) {

		String text = ele.getText();
		System.out.println(" The " +text +" is captured ");

		return text;
	} 

	public void selectDropDownUsingText(WebElement ele, String value) {


		Select src=new Select(ele);
		src.selectByVisibleText(value);

	}

	public String getSelectedDropdownValueUsingValue(WebElement ele, String value) {

		Select src=new Select(ele);
		src.selectByVisibleText(value);
		String selectedDropdownValue = src.getFirstSelectedOption().getText();
		return selectedDropdownValue;

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {

		Select src=new Select(ele);
		src.selectByValue(value);
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select srcind=new Select(ele);
		srcind.selectByIndex(index);

	}

	public void moveToElement(WebElement ele1, WebElement ele2)
	{

		Actions builder=new Actions(driver);
		builder.moveToElement(ele1).pause(2000).click(ele2).perform();

	}

	public boolean verifyTitle(String expectedTitle) {

		String getTitle = driver.getTitle();

		if(getTitle.equals(expectedTitle))
		{
			System.out.println("TiTle is verified");
		}
		else
		{
			System.out.println("Unable to verify the title");
		}

		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {

		String text = ele.getText();
		
		if(text.equals(expectedText))
		{
			System.out.println("Text is verified");
		}
		else
			System.out.println("Unable to verifiy the text");
	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		String text = ele.getText();

		if(expectedText.contains(text))
		{
			System.out.println("Text is verified");
		}
		else
			System.out.println("Unable to verifiy the text");

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		String exactAttr = ele.getAttribute(attribute);

		if(exactAttr.equals(value))
		{
			System.out.println(exactAttr + " is verified ");
		}
		else
		{
			System.out.println(exactAttr + " does not matches");
		}

	}

	public String getAttibuteValue(WebElement ele, String attribute) {

		String exactAttr = ele.getAttribute(attribute);
		return exactAttr;
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		String exactAttr = ele.getAttribute(attribute);

		if(exactAttr.contains(value))
		{
			System.out.println(exactAttr + " is verified ");
		}
		else
		{
			System.out.println(exactAttr + " does not matches");
		}
	}

	public void verifySelected(WebElement ele) {

		if(ele.isSelected())
		{
			System.out.println(ele+ " is selected");
		}
		else
		{
			System.out.println(ele+ " not selected");
		}

	}

	public void verifyDisplayed(WebElement ele) {

		if(ele.isDisplayed())
		{
			System.out.println(ele+ " is displayed");
			
		}
		else
		{
			System.out.println(ele+ " not displayed");
			
		}

	}
	
	public int conversionOfStringTOInt(String name)
	{
		int valueOfInt=Integer.parseInt(name);
		return valueOfInt;
		
	}
	
	public boolean compare(int ele1,int ele2)
	{
		if(ele1<ele2)
		{
			System.out.println(ele1 +" is lower");
		}
		else
		{
			System.out.println(ele2 +" is lower");
		}
		return false;
		
	}

	public void switchToWindow(int index) {

		try {
			Set<String> setWindowHandles = driver.getWindowHandles();
			List<String> listOfWindows=new ArrayList<String>();
			listOfWindows.addAll(setWindowHandles);

			driver.switchTo().window(listOfWindows.get(index));
		} catch (NoSuchWindowException e) {

			System.err.println(" Window not found");
		}


	}

	public void switchToFrame(WebElement ele) {

		try {
			driver.switchTo().frame(ele);
		}
		catch(NoSuchFrameException e) {
			System.err.println("Frame not found");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		finally {
			takeSnap();
		}

	}

	public void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(NoAlertPresentException e) {

			System.err.println(e);

		}
	}

	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public String getAlertText() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println("The alert text is " +alert);

		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {

		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

}
