package stepDefinitions.ecommStepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pageObjects.ecommPageObjects.CartPage;
import pageObjects.ecommPageObjects.TnCPage;
import utilities.ContextSetUp;

public class CartPageStepDefinition
{
    ContextSetUp context;
    public CartPage cartPage;
    public  CartPageStepDefinition(ContextSetUp context)
    {
        this.context=context;
        cartPage=context.pageObjectManager.getCartPage();
    }

   @Then("^User proceed to checkout and validate the (.+) items on checkout page$")
    public void user_added_products_to_cart(String name)
   {
       String cartProduct = cartPage.getProductName();
       try {
           SoftAssert sa = new SoftAssert();
           sa.assertEquals(cartProduct,name);
       }catch (Exception e)
       {
           System.out.println("Validation Failed");
       }
       cartPage.clickPlaceOrder();
       TnCPage tn = context.pageObjectManager.getTnCPage();
       tn.setCountry("India");
       tn.checkTnC();
       tn.clickProceedButton();
   }

   @Then("User should be able to place order successfully")
   public void user_able_to_placeOrder()
   {
       cartPage.clickPlaceOrder();
       TnCPage tn = context.pageObjectManager.getTnCPage();
       tn.setCountry("India");
       tn.checkTnC();
       tn.clickProceedButton();
   }
}
