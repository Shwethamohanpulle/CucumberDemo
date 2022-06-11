package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeComplexityPage {
private WebDriver driver;
	
	//1.create BY locators:
		private By tryHere= By.xpath("//a[@class='btn btn-info']");
		
		
		

		//2.Create Constructor of this class
		public TimeComplexityPage( WebDriver driver) {
			this.driver= driver;
		}
		
		
		public String getTimeComplexityPage () {
			return driver.getTitle();
		}
		//Actions
		public void tryHereClick() {
			driver.findElement(tryHere).click();
		}
		
		
		public TryEditorPage tryHereClickTest() {
			driver.findElement(tryHere).click();
			return new  TryEditorPage (driver);
		}
		
		
}
