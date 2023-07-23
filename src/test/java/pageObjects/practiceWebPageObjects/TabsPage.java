package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class TabsPage
{
    public WebDriver driver;
    private String parentTabHandle;

    public TabsPage(WebDriver driver)
    {
        this.driver=driver;
        parentTabHandle=driver.getWindowHandle();
    }

    //LOcators

    By tabsButton = By.xpath("//a[@id='opentab']");

    //actions /methods

    public void switchToParentTabHandle()
    {
        driver.switchTo().window(parentTabHandle);
    }

    public void switchToChildtabHandle()
    {
        Set<String> tabs = driver.getWindowHandles();
        for(String tab : tabs)
        {
            if(!tab.equals(parentTabHandle))
            {
                driver.switchTo().window(tab);
                break;
            }
        }
    }

    public String getTitle()
    {
        String title = driver.getTitle();
        return title;
    }

    public String getUrl()
    {
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }
}
