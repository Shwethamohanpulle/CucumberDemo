package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryEditorPage {
	
	private WebDriver driver;
	
	//1.Cretaing By locators:
	private By textArea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	private By runBtn = By.xpath("//button[@type='button']");
	private By outputMsg = By.xpath("//pre[@id = 'output']");
	
	//2.Constructor:
	public TryEditorPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//3.Actions
	public String tryEditpageTitle() {
	return	driver.getTitle();
	}
	
	
	public boolean outputText() {
	return	driver.findElement(outputMsg).isDisplayed();
	}
	

	public String runCode( String code) {

		driver.findElement(textArea).sendKeys(code);
		driver.findElement(runBtn).click();
		 String msg =driver.findElement(outputMsg).getText(); 
		return msg;

	}
	

}
