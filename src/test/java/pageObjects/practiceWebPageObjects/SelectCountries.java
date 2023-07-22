package pageObjects.practiceWebPageObjects;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ContextSetUp;

import java.util.List;

public class SelectCountries
{
    public WebDriver driver;
    public SelectCountries(WebDriver driver)
    {
        this.driver=driver;
    }

    private  By selectCoutnries = By.xpath("//input[@placeholder='Type to Select Countries']");

    private By dropDownList = By.xpath("//li[@class='ui-menu-item']/div");

    public void setCountry(String searchKeyword)
    {
        driver.findElement(selectCoutnries).clear();
        driver.findElement(selectCoutnries).sendKeys(searchKeyword);
    }

    public String  getpageTitle()
    {
        String title =driver.getTitle();
        return title;
    }

    public List<WebElement> getListOfCountry()
    {
       List<WebElement> dropdownValues =driver.findElements(dropDownList);
       return dropdownValues;
    }

    public void setDropListValue(String input)
    {
        List<WebElement> dropList = getListOfCountry();
        for(WebElement option : dropList)
        {
            System.out.println(option.getText());
           if(option.getText().equalsIgnoreCase(input))
           {
               option.click();
               break;
           }
        }

    }

    public String getSelectedCountry()
    {
        String country = driver.findElement(selectCoutnries).getAttribute("value");
        return country.toLowerCase().trim();
    }


}
