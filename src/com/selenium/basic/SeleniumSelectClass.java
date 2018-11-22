package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.ebay.in");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	     // WebElement list = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
	      
	      Select select=new Select(driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")));
	      
	      select.selectByVisibleText("Kitchen & Dining");
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//input[@value='Search']")).click();
	      driver.findElement(By.xpath("//a[contains(text(),'HIGH QUALITY Nicer Dicer Plus Vegetable Cutter')]")).click();

	}

}
