package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDyanamicWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.ebay.in");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //dynamic waits
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      Actions action=new Actions(driver);
	      
	      action.moveToElement(driver.findElement(By.linkText("My eBay"))).build().perform();
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//a[contains(text(),'Bids/Offers')]")).click();

	}

}
