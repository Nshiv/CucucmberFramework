package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/search.feature",
        glue = "stepDefinitions",
        monochrome = true
)
public class SearchRunner extends AbstractTestNGCucumberTests
{

}
