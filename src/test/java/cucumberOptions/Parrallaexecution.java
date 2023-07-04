package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(glue = "stepDefinitions",
        features = "src/test/java/features",
        monochrome = true,
        tags = "@Regression",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Parrallaexecution extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios()
    {
        return  super.scenarios();
    }

}
