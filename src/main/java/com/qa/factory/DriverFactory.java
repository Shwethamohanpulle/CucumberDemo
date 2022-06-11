package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	 public WebDriver driver;
	//using the concept of ThreadLocal to run in Parallel mode 
	//it's java aid feature
	 //creating a ThreadLocal instance (WebDriver) and reference (tlDriver)
	 //initializing the WebDriver with  ThreadLocal
	 public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	 
	 
	 
	 /**
		 * This method is used to initialize the thradlocal driver on the basis of given
		 * browser
		 * 
		 * @param browser
		 * @return this will return tldriver.
		 */
	 
	 public WebDriver driverInitialization(String browser) {
		 if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 tlDriver.set(new ChromeDriver());
			 }
		 else if(browser.equals("fireFox")) {
				 WebDriverManager.firefoxdriver().setup();
				 tlDriver.set(new FirefoxDriver());
			 }
		 
		 getDriver().manage().deleteAllCookies();
		 getDriver().manage().window().maximize();
		
			return getDriver();
		
	
	 }

		/**
		 * this is used to get the driver with ThreadLocal
		 * 
		 * @return
		 */
	 
	 public static synchronized WebDriver getDriver() {
	return tlDriver.get(); 
	 }

}
