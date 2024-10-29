package runner;

import baseclass.ProSpecMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Login.feature", glue = "stepDef",//glue = {"stepDef","hooks"}, 
monochrome = true, publish = true)

public class Login_TC_001 extends ProSpecMethod {

}
