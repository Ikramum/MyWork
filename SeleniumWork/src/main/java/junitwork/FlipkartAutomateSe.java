package junitwork;


	import org.junit.Test;
	import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

	public class FlipkartAutomateSe extends SeMethods {
		@Test
		public void FlipkartAutomate() throws InterruptedException
		{ 
			startApp("Chrome","https://www.flipkart.com/");
			WebElement eleCross = locateElement("xpath","//button[text()='?']");
			click(eleCross);
			
			WebElement elemovetoTV = locateElement("xpath","//span[text()='TVs & Appliances']");
			WebElement elemovetosamsung = locateElement("xpath","(//span[text() ='Samsung'])[2]");
			moveToElement(elemovetoTV,elemovetosamsung);
			Thread.sleep(5000);
			
			WebElement eleminprice = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
			selectDropDownUsingText(eleminprice, "?25000");
			
			WebElement elemaxprice = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
			selectDropDownUsingText(elemaxprice, "?60000");
			Thread.sleep(3000);
			
			
			WebElement eleScreesize =locateElement("xpath","//div[text()='Screen Size']");
			click(eleScreesize);
			WebElement elecheckbox =locateElement("xpath","//div[text()='48 - 55']");
			click(elecheckbox);
			Thread.sleep(5000);
			WebElement eleFirstListTv =locateElement("xpath","//*[@id='container']/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div/a");
			click(eleFirstListTv);
			Thread.sleep(5000);
			
			switchToWindow(1);
			Thread.sleep(3000);
			WebElement eleCompare = locateElement("xpath","//span[text()='Compare']");
			click(eleCompare);
			
			closeBrowser();
			
			switchToWindow(0);
			WebElement eleSectListTv =locateElement("xpath","//*[@id='container']/div/div[1]/div[2]/div/div[2]/div[3]/div/div/div/a");
			click(eleSectListTv);
			Thread.sleep(5000);
			
			switchToWindow(1);
			Thread.sleep(3000);
			
			WebElement eleCompare2 = locateElement("xpath","//span[text()='Compare']");
			click(eleCompare2);
			
			Thread.sleep(3000);
			
			WebElement eleToCompare = locateElement("xpath","//span[text()='COMPARE']");
			click(eleToCompare);
			Thread.sleep(2000);
			
			String price1,price2;
			
			WebElement elePrice1 =locateElement("xpath","//*[@id='fk-compare-page']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]");
			WebElement elePrice2 =locateElement("xpath","//*[@id='fk-compare-page']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/div[1]");
					
			WebElement eleBuyNow1 =locateElement("xpath","(//button[text()='BUY NOW'])[1]");
			WebElement eleBuyNow2 =locateElement("xpath","(//button[text()='BUY NOW'])[2]");
			
			price1 =getText(elePrice1);
			price2 = getText(elePrice2);
			price1= price1.substring(1).replace(",","");
			price2= price2.substring(1).replace(",","");
			
			int firstprodPrice =Integer.parseInt(price1);
			int seconfprodPrice =Integer.parseInt(price2);
			
			if (firstprodPrice >seconfprodPrice )
			{
				click(eleBuyNow2);
			}
			else 
			{
				click(eleBuyNow1);
			}
			
			}


	}
