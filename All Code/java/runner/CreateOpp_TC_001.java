package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/feature/Salesforce.feature",glue = "stepDef", monochrome = true, publish = true)
public class CreateOpp_TC_001 extends AbstractTestNGCucumberTests {

}
