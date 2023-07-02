package stepDefinitions;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utilities.ContextSetUp;
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
}
