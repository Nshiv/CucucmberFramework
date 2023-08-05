package cucumbeRunners.practiceWeb;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"stepDefinitions/practiceWebStepDefinition","cucumberHooks"},
        features = "src/test/java/features/practiceWebsite",
        monochrome = true,
        tags="@smoke",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"}
)

public class PracticeWebRunner extends AbstractTestNGCucumberTests
{


}
