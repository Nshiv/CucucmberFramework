package cucumbeRunners.practiceWeb;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"stepDefinitions/practiceWebStepDefinition","cucumberHooks"},
        features = "src/test/java/features/practiceWebsite",
        monochrome = true,
        tags="@wip"
)

public class PracticeWebRunner extends AbstractTestNGCucumberTests
{


}