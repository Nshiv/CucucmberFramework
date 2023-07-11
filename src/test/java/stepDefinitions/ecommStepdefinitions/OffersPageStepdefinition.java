package stepDefinitions.ecommStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pageObjects.ecommPageObjects.LandingPage;
import pageObjects.ecommPageObjects.OfferPage;
import pageObjects.ecommPageObjects.PageObjectManager;
import utilities.ContextSetUp;

public class OffersPageStepdefinition
{
    ContextSetUp context;
    public String offersSearchedResult;
    public PageObjectManager pageObjectManager;
    public OffersPageStepdefinition(ContextSetUp context)
    {
        this.context=context;
    }
    @Then("^User searched with (.+) short name on offers page to check if product exist$")
    public void user_searched_on_OfferPage(String shortName)
    {
        OfferPage offerPage = context.pageObjectManager.getOffersPage();
        LandingPage landingPage = context.pageObjectManager.getlandingPage();
        landingPage.clickTopDeals();
        context.genericUtils.switchWindowToChild();
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
