package com.selenium.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

      Properties prop = new Properties();
      
      FileInputStream ip = new FileInputStream("C:\\SundayFW\\SeleniumSessions\\src\\com\\selenium\\basic\\config.properties");
 
      prop.load(ip);
      
      System.out.println("name of the person:-  "+prop.getProperty("name"));
      
      String browsername  = prop.getProperty("browser");
      String URL = prop.getProperty("url");
      
      System.out.println(browsername);
      System.out.println(URL);
      
      if(browsername.equals("chrome")){
    	  
    	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
      }
      
      driver.get(URL);
      Thread.sleep(3000);
      
      driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("GirishBaliga");
      Thread.sleep(3000);
      System.out.println(driver.getTitle());
      
      driver.close();
      
	}

}
