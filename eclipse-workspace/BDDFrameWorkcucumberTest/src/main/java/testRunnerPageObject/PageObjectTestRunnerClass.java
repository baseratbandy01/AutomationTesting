package testRunnerPageObject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/82009/eclipse-workspace/BDDFrameWorkcucumberTest/src/main/java/pageObjectFeature/pageObject.feature",
		glue= {"PageObjectStepDefinitation"},
		format= {"pretty","html:test1-output", "json:json_output1/cucumber.json", "junit:junit1_xml/cucumber.xml"},
		strict = true,
		monochrome  =true,
		dryRun = false
		)
public class PageObjectTestRunnerClass {

}
