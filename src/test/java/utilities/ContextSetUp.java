package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.ecommPageObjects.PageObjectManager;

import java.io.IOException;

public class ContextSetUp
{
    public WebDriver driver;
    public String landingProductName;

    public PageObjectManager pageObjectManager;

    public TestBase testBase;
    public GenericUtils genericUtils;
    public WebDriverWaitUtils webDriverWaitUtils;

    public ContextSetUp() throws IOException
    {
        this.testBase = new TestBase();
        this.pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
        this.genericUtils = new GenericUtils(testBase.WebDriverManager());
        this.webDriverWaitUtils= new WebDriverWaitUtils(driver);

    }
}
