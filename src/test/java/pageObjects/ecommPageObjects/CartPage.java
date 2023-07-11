package pageObjects.ecommPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ContextSetUp;

public class CartPage
{
    public WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver= driver;
    }

    By addedProduct = By.xpath("//p[@class='product-name']");
    By promoCodeInput = By.xpath("//input[@placeholder='Enter promo code']");
    By placeOrderButton = By.xpath("//button[normalize-space()='Place Order']");

    public String getProductName()
    {
        String productName =driver.findElement(addedProduct).getText().split("-")[0].trim();
        return  productName;
    }

    public boolean getpromoCodeField()
    {
        boolean status=driver.findElement(promoCodeInput).isDisplayed();
        return  status;
    }

    public void clickPlaceOrder()
    {
        driver.findElement(placeOrderButton).click();
    }
}
