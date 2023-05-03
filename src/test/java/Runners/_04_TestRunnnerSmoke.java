package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",//hangi senaryolarda bu etiket kullanılıyor
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}


)

public class _04_TestRunnnerSmoke extends AbstractTestNGCucumberTests {
}
