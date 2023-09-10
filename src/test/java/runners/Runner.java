package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome = true,//makes reports more readable in the console
        features = "src/test/resources/features",//path of feature file
        glue = "stepdefinitions" ,//path of the step definitions
        tags = "@US22",
        dryRun = false //executes to generate missing step definitions

)
public class Runner {
}
