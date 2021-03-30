package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Where the features folder
		features = {"features"},
		
		//Where the step definition
		glue = {"steps"},
		
		//plugin where the output/report
		plugin = { "pretty", "html:Report1"},
		
		//Dry Run option to find out if step definitions are missing
		dryRun = false,
		
		//display setting for output console
		monochrome = true
		
		//Execute a specific tag
		//tags = "@tag"
		
		//Searches for text in the Scenario Name
		//name =  {"Cucumber"}
		)
public class TestRunner {

}
