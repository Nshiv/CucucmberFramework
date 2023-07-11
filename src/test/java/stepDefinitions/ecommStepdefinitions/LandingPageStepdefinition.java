package stepDefinitions.ecommStepdefinitions;

import io.cucumber.java.en.*;
import pageObjects.ecommPageObjects.LandingPage;
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

    @Given("User on GreenCart Landing screen")
    public void user_on_green_cart_landing_screen()
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
        LandingPage lp = context.pageObjectManager.getlandingPage();
        lp.setSearchInput(shortName);
        Thread.sleep(5000);
        landingProductName=lp.getProductName();
        System.out.println(landingProductName);

    }

    @When("^User search products from search bar with keyword (.+)$")
    public void user_searched_with_keywords(String input) throws InterruptedException {
        LandingPage lp = context.pageObjectManager.getlandingPage();
        lp.setSearchInput(input);
        Thread.sleep(3000);
    }

    @And("Added all searched products to cart")
    public void added_all_products_cart() throws InterruptedException {
        LandingPage lp = context.pageObjectManager.getlandingPage();
        lp.clickAddToCart();
        lp.clickCartButton();
        Thread.sleep(2000);
        lp.clickCheckOut();
        Thread.sleep(4000);
    }

}
