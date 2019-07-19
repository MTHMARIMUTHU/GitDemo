package cucumberoption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/features",
			glue = "stepDefinations",tags="@autoTest",monochrome=true,
			plugin= {"pretty","html:target/cucumber","json:target/cucumber/result.json","junit:target/cukes.xml"})
	public class TestRunner {

}

//dryrun -make sure all the scenario has step definition and find the step definition which are not used
//monochrome- remove the unwanted output result character
//strict- Validate the mapping with step definition & scenarion -will fail test case 
//tags-used to run specific test cases