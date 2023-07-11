package pageObjects.ecommPageObjects;

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

    By addToCart = By.xpath("//button[normalize-space()='ADD TO CART']");

    By cartButton = By.xpath("//img[@alt='Cart']");

    By checkOutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");

    public void clickCheckOut()
    {
        driver.findElement(checkOutButton).click();
    }

    public void setSearchInput(String input)
    {
        driver.findElement(searchBar).sendKeys(input);
    }

    public String getProductName()
    {
        String name =driver.findElement(productName).getText().split(" ")[0].trim();
        return name;
    }

    public void clickTopDeals()
    {
        driver.findElement(topDeals).click();
    }

   public void clickAddToCart()
   {
       driver.findElement(addToCart).click();
   }

   public void clickCartButton()
   {
       driver.findElement(cartButton).click();
   }
}
