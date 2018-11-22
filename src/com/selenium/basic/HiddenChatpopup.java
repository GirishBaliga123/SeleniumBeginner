package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenChatpopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
	     //driver.manage().deleteAllCookies();
	      
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
	     
	     driver.get("https://secure.securewebpayments.com/dr-order.php?tt_pxyct=gb&show_upsellit=1");
	     
	     driver.findElement(By.name("firstname")).sendKeys("Girish Baliga");
	      
	   

	}

}
