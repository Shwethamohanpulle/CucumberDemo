package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepdefinations", "AppHooks"},
		plugin = {"pretty",  
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:threadreport/"},
		monochrome= true,//display the console output in proper readable format
		//dryRun = true//to check the mapping is proper between feature file & step def file
		dryRun = false
	
		)

public class MyTestRunner {





}
