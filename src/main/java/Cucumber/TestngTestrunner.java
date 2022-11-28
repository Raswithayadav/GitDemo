package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/Cucumber",glue="amazon.testdefinitions",
monochrome=true,plugin= {"html:target/cucumber.html"})

public class TestngTestrunner extends AbstractTestNGCucumberTests {
		

}
