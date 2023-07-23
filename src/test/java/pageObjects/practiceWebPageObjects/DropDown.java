package pageObjects.practiceWebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown
{
    public WebDriver driver;

    public DropDown(WebDriver driver)
    {
        this.driver=driver;
    }

    //Locators

    By dropList = By.xpath("//select[@name ='dropdown-class-example']");

    //methods and actions

    public void selectByIndex(int x)
    {
        Select select = new Select(driver.findElement(dropList));
        select.selectByIndex(x);
    }

    public String getSelectedDropDownText()
    {
      String selectedValue= driver.findElement(dropList).getAttribute("value");
      return selectedValue;
    }

    public void selectLastValue()
    {
        Select select = new Select(driver.findElement(dropList));
        List<WebElement> options =select.getOptions();
        int last_index = options.size()-1;
        select.selectByIndex(last_index);
    }

    public void selectByValue(String str)
    {
        Select select = new Select(driver.findElement(dropList));
        select.selectByValue(str);
    }

    public void deselectValue(String str)
    {
        Select select = new Select(driver.findElement(dropList));
        select.deselectByValue(str);
    }

    public List<WebElement> getAllSelectedValues()
    {
        Select select = new Select(driver.findElement(dropList));
        List<WebElement> options = select.getAllSelectedOptions();
        return options;
    }

    public void refresh()
    {
        driver.navigate().refresh();
    }
}
