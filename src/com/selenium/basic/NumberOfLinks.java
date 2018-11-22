package com.selenium.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.fatcow.com/");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      List <WebElement> links = driver.findElements(By.tagName("a"));

	      int size = links.size();
	   
	      
	      System.out.println("Total number of links in a webpage is "+size);
	      
	      for(int i=0;i<size;i++)
	      {
	    	  String str = links.get(i).getText();
	    	  System.out.println("name of the link is"+str);
	    	  
	    	  if(str.contains("isWebMail"))
	    	  {
	    		  links.get(i).getText();
	    		  break;
	    	  }
	      }
	      
	      driver.quit();
	}

}
