package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionClass2 {
	
	public static void main(String[] args) throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.spicejet.com");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	
	      Actions action=new Actions(driver);
	      
	      WebElement wb1 = driver.findElement(By.xpath("//a[contains(text(),'Login / Signup')]"));
	      action.moveToElement(wb1).build().perform();
	      Thread.sleep(2000);
	      
	      WebElement wb2=driver.findElement(By.xpath("//a[contains(text(),'SpiceCash/SpiceClub Members')]"));
	      action.moveToElement(wb2).build().perform();
	      Thread.sleep(5000);
	      
	      driver.findElement(By.linkText("Member Login")).click();
	      
	      Thread.sleep(2000);
	      
	      String title=driver.getTitle();     
	      if (title.equals("Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines"))
	      {
	    	  System.out.println("PASS"+" "+title);
	      }
	      else{
	    	  System.out.println("FAIL");
	      }
	}

}
