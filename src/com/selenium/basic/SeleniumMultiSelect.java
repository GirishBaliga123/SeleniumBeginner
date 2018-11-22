// Selecting multiple values from dropdown 

package com.selenium.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMultiSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.get("http://wenzhixin.net.cn/p/multiple-select/docs/");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      WebElement dd = driver.findElement(By.xpath("//select[@multiple='multiple']"));
	      
	      Select select = new Select(dd);
	      
	      boolean b = select.isMultiple();
	      
	      System.out.println("dropdown is multiple:- "+b);
	      
	      select.selectByIndex(0);
	      select.selectByIndex(1);
	      select.selectByIndex(2);
	      
	      List <WebElement> listofselectedoptions = select.getAllSelectedOptions();
	      
	      for(WebElement wb : listofselectedoptions )
	      {
	    	  System.out.println("selected dropdown values are :: "+wb.getText());
	      }
	      
	      int size = select.getOptions().size();
	      
	      
	      System.out.println("number of dropdown options "+size);
	      
	      for(int i=0;i<size;i++)
	      {
	    	  String name = select.getOptions().get(i).getText();
	    	  System.out.println(name);
	      }
	      
	      driver.quit();
	      

	}

}
