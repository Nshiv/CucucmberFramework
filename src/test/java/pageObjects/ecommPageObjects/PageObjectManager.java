package pageObjects.ecommPageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.practiceWebPageObjects.*;

public class PageObjectManager
{
    public LandingPage landingPage;
    public OfferPage offerPage;
    public CartPage cartPage;
    public WebDriver driver;
    public TnCPage tnc;
    public LogoHomePage logoHomePage;
    public RadioButtonElements radioButtonElements;
    public SelectCountries selectCountries;
    public DropDown dropdown;
    public BrowserWindow browserWindow;
    public TabsPage tabsPage;

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

    public RadioButtonElements getRadioButtonElements()
    {
        radioButtonElements=new RadioButtonElements(driver);
        return radioButtonElements;
    }
    public LogoHomePage getLogoHomePage()
    {
        logoHomePage = new LogoHomePage(driver);
        return logoHomePage;
    }

    public SelectCountries getSelectCountries()
    {
        selectCountries= new SelectCountries(driver);
        return selectCountries;
    }

    public DropDown getDropdown()
    {
        dropdown=new DropDown(driver);
        return dropdown;
    }
    public BrowserWindow getBrowserWindow()
    {
        browserWindow=new BrowserWindow(driver);
        return browserWindow;
    }

    public TabsPage getTabsPage()
    {
        tabsPage= new TabsPage(driver);
        return tabsPage;
    }
}
