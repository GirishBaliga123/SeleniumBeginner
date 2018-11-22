package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.fatcow.com/");
	      
	      System.out.println("main page title--"+driver.getTitle());
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      WebElement dropdown = driver.findElement(By.xpath("//select[@id='countrySelect']"));
	      
	      Select select = new Select(dropdown);
	      
	      //select.selectByIndex(1);
	      //select.selectByValue("CAD");
	      //select.selectByVisibleText("Europe");
	       
	      int dropdownsize = select.getOptions().size();
	      
	      System.out.println("total number of elements in dropdwn"+dropdownsize);
	      
	      for(int i=0;i<dropdownsize;i++)
	      {
	    	  
	    	  String s = select.getOptions().get(i).getText();
	    	  System.out.println(s);
	      }
	      driver.quit();
	}

}
