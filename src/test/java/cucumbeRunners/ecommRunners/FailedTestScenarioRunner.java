package cucumbeRunners.ecommRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(glue = "stepDefinitions/ecommStepdefinitions",
        features = "@target/failed_scenarios.txt",
        monochrome = true,
        tags = "@Regression",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"}

)
public class FailedTestScenarioRunner extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios()
    {
        return  super.scenarios();
    }

}
