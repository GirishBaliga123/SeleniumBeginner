

// How to enter the text value without using sendkeys();


package com.selenium.basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;


public class SeleniumJavaScript1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.freecrm.com/index.html");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
		 ((JavascriptExecutor)driver).executeScript("document.getElementById('u_0_i').value='Quality';");		

		
	}

}
