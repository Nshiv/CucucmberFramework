package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/multiproductCheckout.feature",
        glue = "stepDefinitions",
        monochrome = true
)

public class MultiOrderCreationRunner extends AbstractTestNGCucumberTests
{
}
