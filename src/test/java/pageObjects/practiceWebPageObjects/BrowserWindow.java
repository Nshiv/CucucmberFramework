package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserWindow
{
    public WebDriver driver;
    public String parentWindowHandle;

    public BrowserWindow(WebDriver driver)
    {
    this.driver= driver;
    parentWindowHandle= driver.getWindowHandle();
    }

    // locator

    By windowButton = By.xpath("//button[@id='openwindow']");

    //Actions

    public void navigateToChildWindow()
    {
      Set<String> allWindowHandle = driver.getWindowHandles();
      for(String windowHandle : allWindowHandle)
      {
          if(!windowHandle.equals(parentWindowHandle))
          {
              driver.switchTo().window(windowHandle);
              break;
          }
      }

    }

    public  void switchToParentWindow()
    {
        driver.switchTo().window(parentWindowHandle);
    }

    public void clickWindowHandleButton()
    {
        driver.findElement(windowButton).click();
    }

    public String getTitle()
    {
        String title =driver.getTitle();
        return title.toLowerCase().trim();
    }

    public String getUrl()
    {
        String currentUrl= driver.getCurrentUrl();
        return currentUrl.trim();
    }

}
