package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoHomePage
{
    public WebDriver driver;
    public LogoHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    By logoHomePage = By.xpath("//img[@class ='logoClass']");

    public boolean logoImageStatus()
    {
        boolean status = driver.findElement(logoHomePage).isDisplayed();
        return status;
    }

    public String getPageTitle()
    {
        String pageTitle = driver.getTitle();
        return pageTitle.toLowerCase().trim();
    }
}
