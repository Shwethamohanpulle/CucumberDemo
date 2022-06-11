package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageSteps { 
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	

@Given("user is on login page")
public void user_is_on_login_page() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
  
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	 title =loginPage.getLoginPageTitle();
		System.out.println("page title is :"+title );
    
}

@Then("page title should be {string}")
public void page_title_should_be(String expectedTitleName) {
	Assert.assertTrue(title.contains(expectedTitleName));
}

@When("user enters username {string}")
public void user_enters_username(String username) {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	loginPage.enterUserName(username);
}

@When("user enters password {string}")
public void user_enters_password(String password) {
 loginPage.enterPassword(password);
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {
	loginPage.clickOnLogin(); 
}


@Then("user gets the title of home page")
public void user_gets_the_title_of_home_page() {	
title = loginPage.getHomePageTitle();
System.out.println("Home page title is :"+title);


}














}
