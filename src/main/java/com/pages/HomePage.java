package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	//1.create BY locators:
	private By DataStructureModule = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div/div/div/a");

	

	//2.Create Constructor of this class
	public HomePage (WebDriver driver) {
		this.driver= driver;
	}
	
	//Actions
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public DataStructurePage clickOnLinkTest() {
		driver.findElement(DataStructureModule).click();
		return new DataStructurePage(driver);
	}
	
	public void clickOnLink() {
		driver.findElement(DataStructureModule).click();
		
	}

}
