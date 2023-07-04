package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import utilities.ContextSetUp;
public class LandingPageStepdefinition
{
    public String landingProductName;
    ContextSetUp context;
    public LandingPageStepdefinition(ContextSetUp context)
    {
       this.context=context;
    }

    @Given("User on GreenCart Landing page")
    public void user_on_green_cart_landing_page()
    {

    }

    @When("^User searched with short name (.+)$")
    public void user_searchedwith_name(String name) throws InterruptedException {
        LandingPage lp = context.pageObjectManager.getlandingPage();
        lp.setSearchInput(name);
        Thread.sleep(2000);

    }

    @And("User added searched product to cart")
    public void user_added_product_to_cart() throws InterruptedException {
        LandingPage lp = context.pageObjectManager.getlandingPage();
        lp.clickAddToCart();
        lp.clickCartButton();
        lp.clickCheckOut();
        Thread.sleep(5000);

    }


    @When("^Search with small name (.+) and extracted actual name of product$")
    public void user_searched_landingScreen(String shortName) throws InterruptedException {
        LandingPage landingPage = context.pageObjectManager.getlandingPage();
        landingPage.setSearchInput(shortName);
        Thread.sleep(5000);
        landingProductName=landingPage.getProductName();
        System.out.println(landingProductName);

    }


}
