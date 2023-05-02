package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}//basit rapor
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
