package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager
{
    public LandingPage landingPage;
    public OfferPage offerPage;
    public CartPage cartPage;
    public WebDriver driver;
    public TnCPage tnc;

    public PageObjectManager(WebDriver driver)
    {
       this.driver= driver;
    }
    public LandingPage getlandingPage()
    {
        landingPage= new LandingPage(driver);
        return landingPage;
    }

    public OfferPage getOffersPage()
    {
       offerPage = new OfferPage(driver);
       return offerPage;
    }

    public CartPage getCartPage()
    {
       cartPage= new CartPage(driver) ;
       return cartPage;
    }

    public TnCPage getTnCPage()
    {
        tnc = new TnCPage(driver);
        return tnc;
    }
}
