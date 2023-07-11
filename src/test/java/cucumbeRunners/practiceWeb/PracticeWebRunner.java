package cucumbeRunners.practiceWeb;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "stepDefinitions/practiceWebStepDefinition",
        features = "src/test/java/features/practiceWebsite",
        monochrome = true
)

public class PracticeWebRunner extends AbstractTestNGCucumberTests
{


}
