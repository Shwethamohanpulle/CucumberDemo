package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	
private WebDriver driver;
	
	
	//1.create By Locators or object Repository
	private By getStarted = By.xpath("//div[@class='content']/a/button");
	
	//2.Create Constructor of this class
	public MainPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//3.page Actions
	public String getMainpageTitle() {
		return driver.getTitle();
	

}
