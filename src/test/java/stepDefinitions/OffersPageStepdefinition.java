package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utilities.ContextSetUp;

import java.util.Iterator;
import java.util.Set;

public class OffersPageStepdefinition
{
    ContextSetUp context;
    public String offersSearchedResult;
    public PageObjectManager pageObjectManager;
    public OffersPageStepdefinition(ContextSetUp context)
    {
        this.context=context;
    }
    @Then("User searched with {string} short name on offers page to check if product exist")
    public void user_searched_on_OfferPage(String shortName)
    {
        pageObjectManager = new PageObjectManager(context.driver);
        OfferPage offerPage = pageObjectManager.getOffersPage();
        LandingPage landingPage = pageObjectManager.getlandingPage();
        landingPage.clickTopDeals();
        Set<String> windows = context.driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childwindow= it.next();
        context.driver.switchTo().window(childwindow);
        offerPage.setSearchKeyword(shortName);
        offersSearchedResult= offerPage.getProductName();
        System.out.println(offersSearchedResult);

    }

    @And("Validate same product name displays on both screens")
    public void asserting_results()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(context.landingProductName,offersSearchedResult);
        System.out.println("Test cases executed");
    }
}
