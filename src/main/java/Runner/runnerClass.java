package Runner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="/Users/rajeshsharma/Documents/workspace-sts-3.9.0.RELEASE/SeleniumWithCucumber/src/main/java/Features",
                 glue={"step.definition"}, 
                 monochrome = true, //makes console output more readable
                 //tags --- tells what tags to be executed
                 plugin = {"pretty","html:target/report","json:target/cucumber.json"},
                 dryRun = false,
                 strict = true)	//any undefined steps are failed


public class runnerClass {

}
  //runner class