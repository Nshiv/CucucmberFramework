package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager
{
    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;

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
}
