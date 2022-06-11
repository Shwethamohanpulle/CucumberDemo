package stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.DataStructurePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TimeComplexityPage;
import com.pages.TryEditorPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DataStructureModuleSteps {
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	private DataStructurePage datastructure;
	private TimeComplexityPage timecom;
	private TryEditorPage tryedit;
	
	
	
	
	//Background:
	@Given("user has already logged  into Application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
	List<Map<String,String>> credList =	dataTable.asMaps();
	String userName = credList.get(0).get("username");
	 String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		 homepage = loginPage.doLogin(userName, password);
	}
//scenario 1
	@Given("user is on home page")
	public void user_is_on_home_page() {
	homepage = new 	HomePage(DriverFactory.getDriver());
    title =	homepage.getHomePageTitle();
    System.out.println("Home page title is :"+title );
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title =loginPage.getLoginPageTitle();
		System.out.println("page title is :"+title ); 
	}


	@Then("page title should be NumpyNinja")
	public void page_title_should_be_numpy_ninja() {
	   Assert.assertEquals("NumpyNinja",homepage.getHomePageTitle());
	}

	
	//Scenario2
	
	@When("user clicks on first link")
	public void user_clicks_on_first_link() {
		homepage.clickOnLink(); 
	}

	@Then("user should land on Data Structure page")
	public void user_should_land_on_data_structure_page() {
		datastructure = new  DataStructurePage (DriverFactory.getDriver());
	Assert.assertEquals("Data Structures-Introduction",datastructure.getDataStructurePageTitle());
	}
	
	

	@When("user clicks on first link of data strucure")
	public void user_clicks_on_first_link_of_data_strucure() {
		  timecom	= datastructure.clickLink();
	}

	@Then("page title should be Time Complexity")
	public void page_title_should_be_time_complexity() {
		timecom = new  TimeComplexityPage(DriverFactory.getDriver()); 
		 Assert.assertEquals("Time Complexity",timecom.getTimeComplexityPage());
	}
	
	


@When("user clicks on tryhere button")
public void user_clicks_on_tryhere_button() {
	timecom.tryHereClick();
}

@Then("user should navigated to Assessment page")
public void user_should_navigated_to_assessment_page() {
	tryedit =	 new TryEditorPage(DriverFactory.getDriver());
	Assert.assertEquals("Assessment",tryedit.tryEditpageTitle());
}



@Then("Clicks on Run button")
public void clicks_on_run_button() {
	 String	code = "print(\"Successfully reached edit box\")";
	 tryedit.runCode(code);
	 
}
@Then("user should see output text")
public void user_should_see_output_text() {
	System.out.println(tryedit.outputText());
}

}
