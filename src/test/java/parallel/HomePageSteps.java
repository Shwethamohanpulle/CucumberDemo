package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.DataStructurePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TimeComplexityPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageSteps {
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	private DataStructurePage datastructure;
	private TimeComplexityPage timecom;
	
	
	
	
	
	
	@Given("user has already logged  into Application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
	List<Map<String,String>> credList =	dataTable.asMaps();
	String userName = credList.get(0).get("username");
	 String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		 homepage = loginPage.doLogin(userName, password);
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
    title =	homepage.getHomePageTitle();
    System.out.println("Home page title is :"+title );
	}
	
	@When("user clicks on first link")
	public void user_clicks_on_first_link() {
		 datastructure = homepage.clickOnLink(); 
	}

	@Then("user should land on Data Structure page")
	public void user_should_land_on_data_structure_page() {
	title =	datastructure.getDataStructurePageTitle(); 
	System.out.println("Data Strucute page title is :"+title);
	}
	
	@Given("user is on data strucure page")
	public void user_is_on_data_strucure_page() {
		 datastructure	= homepage.clickOnLinkTest();
		title =	datastructure.getDataStructurePageTitle();
	    System.out.println("page title is :"+title );   
	}

	@When("user clicks on first link of data strucure")
	public void user_clicks_on_first_link_of_data_strucure() {
		timecom = datastructure.clickLink();
	}

	@Then("user should navigated to {string} page")
	public void user_should_navigated_to_page(String expectedPageTitle) {
	System.out.println(expectedPageTitle);
	    
	}

}
