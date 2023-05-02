package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void after(Scenario scenario){
        System.out.println("Senaryo bitti");

        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",
                scenario,GWD.threadBrowserGet());

        if(scenario.isFailed()){
           TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
           byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
           scenario.attach(hafizadakiHali,"image/png","screenshot");
        }
        GWD.quitDriver();

    }
}
