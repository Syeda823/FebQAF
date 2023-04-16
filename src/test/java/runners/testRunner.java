package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Feature",
		
		glue = "steps"
		
		
		)
		

public class testRunner extends AbstractTestNGCucumberTests{
		
		//This class will run every scenario as a separated test
	}


