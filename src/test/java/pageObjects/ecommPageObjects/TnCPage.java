package pageObjects.ecommPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TnCPage
{
    public WebDriver driver;

    public TnCPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By TnCCheckbox = By.xpath("//input[@type='checkbox']");

    By selectCountry = By.xpath("//div[@class='wrapperTwo']//div//select");

    By proceedButton = By.xpath("//button[normalize-space()='Proceed']");

    public void checkTnC()
    {
        driver.findElement(TnCCheckbox).click();
    }

    public void setCountry(String country)
    {
        Select obj = new Select(driver.findElement(selectCountry));
        obj.selectByValue(country);
    }

    public void clickProceedButton()
    {
        driver.findElement(proceedButton).click();
    }
}
