package runnerPacakage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features= "C://Users/82009/eclipse-workspace/BDDFrameWorkcucumberTest/src/main/java/cucumberFeature/contacts.feature",//path of feature file
glue= {"stepDefination"},//path of stepdefination class
format= {"pretty","html:test-output","json:json_ouput/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different type of report
monochrome=true,//display the console output in a paper readable format
strict=true,//it will check if any step is not defined in step definition
dryRun=false)
//tags= {"@SmokeTest"})//for check u got all stepdefinition make dryrun true first it will show u report of stepdefinition then make it false to run the test
//or in  tags means={"@smokeTest,@regressionTest"}--excute all test tagged as @SmokeTest or reggerssionTest
//And:tags=tags={"@smokeTest",@"regerisionTest"}==it will excute test taged as @SmokeTest AND @RegressionTest
// if u want to ignore the  some special chartee needed to pass before @
public class TestRunner {
	

}
  