package com.selenium.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBootstrap1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      
	      driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
	      
	      List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//label"));
	      
	      System.out.println(list.size());
	            
	      for (int i=0;i<list.size();i++)
	      {
	    	  String str = list.get(i).getText();
	    	  System.out.println(str);
	    	  
	    	  list.get(i).click();
	    	  
	    	  
	    	 /* if(str.contains("Angular"))
	    	  {
	    		  list.get(i).click();
	    		  break;
	    	  }*/
	      }

	}

}
