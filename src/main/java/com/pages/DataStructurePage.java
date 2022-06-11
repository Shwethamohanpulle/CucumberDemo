package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DataStructurePage {
	
	private WebDriver driver;
	
	//1.create BY locators:
		private By link = By.xpath("//a[@class='list-group-item']");
		
		

		//2.Create Constructor of this class
		public DataStructurePage (WebDriver driver) {
			this.driver= driver;
		}
		
		//Actions
		public String getDataStructurePageTitle() {
			return driver.getTitle();
		}
		
		public TimeComplexityPage clickLink() {
			driver.findElement(link).click();
			return new TimeComplexityPage(driver);
		}
		
//		public void clickLink() {
//			driver.findElement(link).click();
//			
//		}
}
