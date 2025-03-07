package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/",
		glue = "Steps",
		tags = "@tag1",
		plugin = {"pretty", "html:Test/nubank.html"},
		monochrome = true ,
		dryRun = false

		
		
		
		
		
		)



		
		
		
public class Runner {

}
