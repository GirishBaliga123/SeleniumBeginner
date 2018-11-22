package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlertClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      driver.findElement(By.xpath("//input[@value='Go']")).click();
	      
	      
	      Alert alert = driver.switchTo().alert();
	      
	      String text = alert.getText();
	      System.out.println(text);
	      
	      Thread.sleep(2000);
	      
	      alert.accept();
	      

	}

}
