package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase
{
    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException
    {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String project_url=prop.getProperty("url1");
        String browser_prop = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");
        String browser = browser_maven != null ? browser_maven:browser_prop;
        if(driver==null) {
            if(browser.equalsIgnoreCase("chrome"))
            {
                String chromeDriverPath = System.getProperty("user.dir")+"/src/test/resources/testDrivers/chromedriver";
                System.out.println(chromeDriverPath);
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            }
           else if(browser.equalsIgnoreCase("edge"))
            {
                String edgeDriverPath = System.getProperty("user.dir")+"/src/test/resources/testDrivers/msedgedriver";
                System.out.println(edgeDriverPath);
                System.setProperty("webdriver.edge.driver",edgeDriverPath);

                driver = new EdgeDriver();
            }
           else {
                System.out.println("Invalid browser inputs"+browser);
            }

            driver.get(project_url);
        }
        return driver;
    }
}
