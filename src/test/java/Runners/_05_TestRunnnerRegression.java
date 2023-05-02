package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        // or yerine and yazılırsa hem smoke hem de regression tag i olanları çalıştırıyor
        // tags = "@SmokeTest and @Regression",//burada ise sadece iki etiketli olan featureslar çalışır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}


)

public class _05_TestRunnnerRegression extends AbstractTestNGCucumberTests {
}
