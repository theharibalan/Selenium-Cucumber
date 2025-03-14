package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features",
        glue = {"StepDefinitions"}, monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/reports.xml",
                "html:target/HTMLReports/reports.html",
                "json:target/JSONReports/reports.json"
        },
tags = "@smoketest")
public class TestRunner {

}
