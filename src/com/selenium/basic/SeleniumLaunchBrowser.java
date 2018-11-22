package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumLaunchBrowser {

	public static void main(String[] args) {
  
		// Selenium version-3.10.0 with gecko driver 0.14
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	
      WebDriver driver=new FirefoxDriver();
      driver.get("http://www.google.com");
      String tittle=driver.getTitle();
      System.out.println("tittle is:-"+tittle);
      
      if(tittle.equals("Google"))
      {
    	  System.out.println("Correct title-->>PASS");
      }else{
    	  System.out.println("Wrong title--->>FAIL");
      }
      
      driver.quit();
     
	}

}
