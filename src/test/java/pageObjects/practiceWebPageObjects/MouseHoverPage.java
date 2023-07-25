package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebDriverWaitUtils;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MouseHoverPage
{
public WebDriver driver;
public WebDriverWaitUtils webDriverWaitUtils;
public MouseHoverPage(WebDriver driver)
{
    this.driver= driver;
}

// elements
By mouseHover = By.xpath("//button[@id='mousehover']");

By mouseHouseDropLIst = By.xpath("//div[@class='mouse-hover-content']/a");


// actions or methods

 public void performMouseHover(WebElement element)
 {
     Actions actions = new Actions(driver);
     actions.moveToElement(element).perform();
 }

 public void moveToButton()
 {
     WebElement button =driver.findElement(mouseHover);
     performMouseHover(button);
 }

 public List<String> getListofMouseHoverElement()
 {
  List<String> dropListelements = new ArrayList<String>();
  List<WebElement> elements =driver.findElements(mouseHouseDropLIst);
  for(WebElement element : elements)
  {
      String elementtext =element.getText();
      dropListelements.add(elementtext);
  }
  return dropListelements;

 }

public void waitforElementsToVisible()
{
 WebElement dropValues = driver.findElement(mouseHouseDropLIst);
 Duration duration = Duration.ofSeconds(10);
 webDriverWaitUtils.waitForElementToBeVisible(dropValues,duration);
}

public void waitForElementToClick()
{
    WebElement dropValues = driver.findElement(mouseHouseDropLIst);
    Duration duration = Duration.ofSeconds(10);
    webDriverWaitUtils.waitForElementToBeClickable(dropValues,duration);
}

}
