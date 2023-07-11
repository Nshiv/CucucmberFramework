package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonElements
{
public WebDriver driver;
public RadioButtonElements(WebDriver driver)
{
    this.driver=driver;
}

By radioButton = By.xpath("//input[@value='radio1']");
By allRadioButtons = By.xpath("//input[@name='radioButton']");

By radiobuttonHeading = By.xpath("//legend[text()='Radio Button Example']");

public void clickRadioButton()
{
    driver.findElement(radioButton).click();
}

public boolean getRadioButtonStatus()
{
    return driver.findElement(radioButton).isSelected();
}

public List  getAllRadioButtons()
{
   List<WebElement> radioList = driver.findElements(allRadioButtons);
   return radioList;
}

public String getHeadingOfRadioButtons()
{
    String heading =driver.findElement(radiobuttonHeading).getText();
    return  heading;
}

public String getPageTitle()
{
    String title = driver.getTitle();
    return title;
}
}
