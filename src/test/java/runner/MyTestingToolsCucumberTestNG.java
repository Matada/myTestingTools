package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/",
        glue = "/",
        plugin = "pretty:target/test-report.html")

public class MyTestingToolsCucumberTestNG extends AbstractTestNGCucumberTests {
}
