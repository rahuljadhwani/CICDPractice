package runnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class RunnerOrangeTest {
	
	
	
		
		@RunWith(Cucumber.class)
		@CucumberOptions(features="features",glue= {"stepdefs"})

		
		public class testRunner {
			
		}

	


}
