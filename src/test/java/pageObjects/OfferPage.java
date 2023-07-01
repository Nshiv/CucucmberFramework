package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage
{
    public WebDriver driver;
    public OfferPage(WebDriver driver)
    {
        this.driver= driver;
    }
    By topDeals = By.xpath("//a[text()='Top Deals']");
    By searchOffer = By.xpath("//input[@type='search']");

    By productName = By.xpath("//td[normalize-space()='Tomato']");

    public void clickTopDeals()
    {
        driver.findElement(topDeals).click();
    }

    public void setSearchKeyword(String name)
    {
        driver.findElement(searchOffer).sendKeys(name);
    }

    public String getProductName()
    {
        String product =driver.findElement(productName).getText();
        return product;
    }


}
