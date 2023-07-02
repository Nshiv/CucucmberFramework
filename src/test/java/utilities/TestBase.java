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
    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src/test/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String project_url=prop.getProperty("url");
        if(driver==null) {
            if(prop.getProperty("browser")=="chrome")
            {
                String path = "C:/Driver/chromedriver/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", path);
                driver = new ChromeDriver();
            }
            if(prop.getProperty("browser")=="firefox")
            {
                //firefox
            }

            driver.get(project_url);
        }
        return driver;
    }
}
