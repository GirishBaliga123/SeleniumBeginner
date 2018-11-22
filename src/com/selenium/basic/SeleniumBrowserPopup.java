package com.selenium.basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.popuptest.com");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      driver.findElement(By.linkText("Come & Go Test")).click();
	      
	      Set <String> handle = driver.getWindowHandles();
	       
	      Iterator <String> it = handle.iterator();
	      
	      String parenetwindowid = it.next();
	      System.out.println("Parent window id"+parenetwindowid);
	      
	      String childwindowid = it.next();
	      System.out.println("Child window id"+childwindowid);
	      
	      driver.switchTo().window(childwindowid);
	      
	      driver.manage().window().maximize();
	      
	      Thread.sleep(2000);
	      
	      driver.close();
	      
	      driver.switchTo().window(parenetwindowid);
	      Thread.sleep(2000);
	      
	      System.out.println("parent window title"+driver.getTitle());
	      
	      
	      
	      
	      
	      

	}

}
