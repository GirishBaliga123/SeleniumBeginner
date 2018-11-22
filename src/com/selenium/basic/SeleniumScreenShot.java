package com.selenium.basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SeleniumScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.spicejet.com");
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //take screenshot and save as file format
	      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      
	      FileUtils.copyFile(src, new File("C:\\SundayFW\\SeleniumSessions\\src\\com\\selenium\\basic\\spicejet.png"));
	      
	      Thread.sleep(1000);

	}

}
