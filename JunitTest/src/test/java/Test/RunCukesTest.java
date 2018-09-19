package Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue = {"stepDeff"},plugin = { "pretty", "html:target/Reports/cucumber-html-report", "json:target/Reports/cucumber.json",
"junit:target/Reports/cucumber.xml" },tags= {"@test1"})
public class RunCukesTest {

}
