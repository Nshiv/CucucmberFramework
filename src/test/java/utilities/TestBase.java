package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase
{
    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException
    {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String project_url=prop.getProperty("url");
        if(driver==null) {
            if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
            {
                String chromeDriverPath = System.getProperty("user.dir")+"/src/test/resources/testDrivers/chromedriver";
                System.out.println(chromeDriverPath);
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver = new ChromeDriver();
            }
            if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
            {
                //firefox
            }

            driver.get(project_url);
        }
        return driver;
    }
}
