package cucumberHooks;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ContextSetUp;

import java.io.File;
import java.io.IOException;
public class Hooks
{
    public ContextSetUp contextSetUp;
    public Hooks(ContextSetUp  contextSetUp)
    {
       this.contextSetUp=contextSetUp;
    }
    @After(order = 1)
    public void quitBrowser() throws IOException
    {
      WebDriver driver=contextSetUp.testBase.WebDriverManager();
      if(driver!=null)
      {
          driver.quit();
      }
    }

    @After(order = 2)
    public void closeBrowser() throws IOException
    {
        WebDriver driver=contextSetUp.testBase.WebDriverManager();
        if(driver!=null)
        {
            driver.close();
        }
    }

    @AfterStep
    public void addScreenShot(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            WebDriver driver =contextSetUp.testBase.WebDriverManager();
            File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] filecontent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(filecontent,"image/png","image");
        }

    }
}
