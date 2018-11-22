package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFrames {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
	      
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.freecrm.com/index.html");
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	      	      
	      driver.findElement(By.name("username")).sendKeys("GirishBaliga");
	      driver.findElement(By.name("password")).sendKeys("test@123");
	      //driver.findElement(By.xpath("//input[@value='Login']")).click();
	      
	      driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	      
	      //driver.findElement(By.cssSelector("button.btn")).click();
	      
	      
	      driver.quit();
	      

	}

}
