package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage
{
    public WebDriver driver;

    public IframePage(WebDriver driver)
    {
      this.driver=driver;
    }

    //Locators
    By iFrame1 = By.xpath("//iframe[@id='courses-iframe']");

    By logo = By.xpath("//div[@class='logo']/a/img");

    //Actions/methods

    public void switchToiFrame()
    {
        driver.switchTo().frame(driver.findElement(iFrame1));
    }
    public void switchToMainSCreen()
    {
        driver.switchTo().defaultContent();
    }

    public boolean getlogoElement()
    {
      boolean status =driver.findElement(logo).isDisplayed();
      return status;
    }
}
