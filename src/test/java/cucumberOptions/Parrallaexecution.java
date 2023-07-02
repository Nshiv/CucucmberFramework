package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(glue = "stepDefinitions",
        features = "src/test/java/features/search.feature",
        monochrome = true

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
