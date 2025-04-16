package HRM.Core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = "src/test/java/HRM/feature",
            glue = {"HRM.Steps"},
            plugin = {
            "pretty",
            "html:target/cucumber-report.html",
            "json:target/cucumber.json",
            "timeline:test-output-thread/"
    },
            monochrome = true
    )
    public class testRunner extends AbstractTestNGCucumberTests{

    }

