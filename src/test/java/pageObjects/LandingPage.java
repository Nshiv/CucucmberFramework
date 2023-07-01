package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage
{
    public WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By searchBar = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");

    By topDeals = By.xpath("//a[text()='Top Deals']");

    public void setSearchInput(String input)
    {
        driver.findElement(searchBar).sendKeys(input);
    }

    public void getProductName()
    {
        driver.findElement(productName).getText().split(" ")[0].trim();
    }

    public void clickTopDeals()
    {
        driver.findElement(topDeals).click();
    }


}
