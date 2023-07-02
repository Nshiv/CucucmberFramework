package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class ContextSetUp
{
    public WebDriver driver;
    public String landingProductName;

    public PageObjectManager pageObjectManager;

    public TestBase testBase;
    public GenericUtils genericUtils;
    public ContextSetUp() throws IOException {
        TestBase testBase = new TestBase();
        pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }
}
