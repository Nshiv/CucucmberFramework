package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.CartPage;
import pageObjects.TnCPage;
import utilities.ContextSetUp;

public class CartPageStepDefinition
{
    ContextSetUp context;
    public  CartPageStepDefinition(ContextSetUp context)
    {
        this.context=context;
    }

   @Then("^User proceed to checkout and validate the (.+) items on checkout page$")
    public void user_added_products_to_cart(String name)
   {
       CartPage cp=context.pageObjectManager.getCartPage();
       String cartProduct = cp.getProductName();
       try {
           SoftAssert sa = new SoftAssert();
           sa.assertEquals(cartProduct,name);
       }catch (Exception e)
       {
           System.out.println("Validation Failed");
       }
       cp.clickPlaceOrder();
       TnCPage tn = context.pageObjectManager.getTnCPage();
       tn.setCountry("India");
       tn.checkTnC();
       tn.clickProceedButton();





   }
}
