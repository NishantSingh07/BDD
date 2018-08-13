package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="C:\\Users\\ZSINNIS\\eclipse-workspace\\BDD\\Feature\\Test.Feature"
		,glue= {"stepDefinition"},
		format = {"pretty","html:test-output"},
		monochrome =true,
		strict =true
		
		)

public class testrunner {
	


}





