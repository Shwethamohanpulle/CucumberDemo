package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/parallel"},
		glue = {"parallel" },
		plugin = {"pretty",  
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:threadreport/"},
		monochrome= true,//display the console output in proper readable format
		//dryRun = true//to check the mapping is proper between feature file & step def file
		dryRun=false
	
		)

public class ParallelRun extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
