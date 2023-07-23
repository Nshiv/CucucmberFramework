package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.practiceWebPageObjects.SelectCountries;
import utilities.ContextSetUp;

public class SuggestionsStepDefinition
{
    public ContextSetUp contextSetUp;
    public SelectCountries selectCountries;
    SoftAssert sa = new SoftAssert();
    public SuggestionsStepDefinition(ContextSetUp contextSetUp)
    {
        this.contextSetUp=contextSetUp;
        selectCountries=contextSetUp.pageObjectManager.getSelectCountries();
    }

    @Given("User is on Homepage with title {string}")
    public void user_is_on_homePage(String str)
    {
      String  actual =selectCountries.getpageTitle().toLowerCase().trim();
      sa.assertEquals(actual,str.toLowerCase().trim());
    }

    @When("User type first three letter of country name as {string}")
    public void user_type_search_input_chars(String string)
    {
      selectCountries.setCountry(string);
    }

    @Then("Select country {string} from dropdown list")
    public void select_country_from_dropdownList(String string)
    {
        selectCountries.setDropListValue(string);
    }

    @And("Selected country should be display in search bar")
    public void validate_correct_country_selected()
    {
      Assert.assertEquals(selectCountries.getSelectedCountry(),"india");

    }



}
