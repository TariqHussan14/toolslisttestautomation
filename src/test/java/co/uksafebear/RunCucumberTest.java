package co.uksafebear;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report/cucumber.json"},
        // glue = "path to stepdefs if not in the same folder"
        //features = path to features if not in the co.uksafebear folder"
        tags = "not @to-do"
)
public class RunCucumberTest {
}
