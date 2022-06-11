package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	
	//1.create By Locators or object Repository
	private By getStarted = By.xpath("//div[@class='content']/a/button");
	private By signinOption = By.xpath("//div[@class='navbar-nav']/ul/a[3]");
	private By userName = By.xpath("//form[@method='post']/input[@id='id_username']");
	private By password = By.xpath("//form[@method='post']/input[@id='id_password']");
	private By loginBtn = By.xpath("//input[@type='submit']");
	private By signOut = By.xpath("//div[@class='navbar-nav'][2]/ul/a[3]");
	//2.Create Constructor of this class
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//3.page Actions
	public String getPortalpageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void getStartedLinkTest() {
		driver.findElement(getStarted).click();
	}
	
	public void signinButtonTest() {
		driver.findElement(signinOption).click();
	}
	
	public void enterUserName(String username) {
		driver.findElement(userName ).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}
	
	
	public HomePage doLogin(String username, String pwd) {
		System.out.println("login with: " + username + " and " + pwd);
		driver.findElement(userName ).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new HomePage(driver);
	}


}
