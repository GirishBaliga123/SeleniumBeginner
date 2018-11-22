package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	      
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
	    driver.get("http://api.jquery.com/dblclick/");
	    
	    driver.switchTo().frame(0);

	    WebElement e  = driver.findElement(By.xpath("//span[text()='Double click the block']"));
	    
	    Actions action = new Actions(driver);
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);
	    
	    Thread.sleep(3000);
	    
	    action.doubleClick(e).build().perform();
	     
	}

}
