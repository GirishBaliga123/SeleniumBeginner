package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionClass {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		 /*
		  ChromeOptions option = new ChromeOptions();
		  option.addArguments("window-size=1400,800");
		  option.addArguments("headless");*/
		  
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.spicejet.com");
	      
	      System.out.println("main page title--"+driver.getTitle());
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      Actions action = new Actions(driver);
	      
	      WebElement mainmenu= driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"));
	      
	      action.moveToElement(mainmenu).build().perform();
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//a[contains(text(),'Hot Meals')]")).click();
	      
	      Thread.sleep(3000);
	      
	      driver.quit();
	}

}
