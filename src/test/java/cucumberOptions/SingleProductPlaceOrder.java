package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "stepDefinitions",
        features = "src/test/java/features/oneProductCheckout.feature",
        monochrome = true
)
public class SingleProductPlaceOrder extends AbstractTestNGCucumberTests
{

}
