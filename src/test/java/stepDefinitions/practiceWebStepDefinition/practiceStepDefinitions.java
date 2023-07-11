package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.RadioButtonElements;
import utilities.ContextSetUp;

public class practiceStepDefinitions
{
    public ContextSetUp contextSetUp;
    public RadioButtonElements radioButtonElements;
    public practiceStepDefinitions(ContextSetUp contextSetUp)
    {
        this.contextSetUp=contextSetUp;
    }

    @Given("^User is on Practice Landing screen$")
    public void user_on_landingscreen()
    {
        radioButtonElements=contextSetUp.pageObjectManager.getRadioButtonElements();
        String pagetitle= radioButtonElements.getPageTitle();
        String expectedTitle="Practice Page";
        Assert.assertEquals(pagetitle,expectedTitle);
    }

    @When("^User click on first radio button$")
    public void user_clicks_firstRadiobutton()
    {
        radioButtonElements=contextSetUp.pageObjectManager.getRadioButtonElements();
        radioButtonElements.clickRadioButton();
    }

    @Then("^Radio button should be selected$")
    public void selected_radioButton_validation()
    {
        radioButtonElements=contextSetUp.pageObjectManager.getRadioButtonElements();
        Boolean status=radioButtonElements.getRadioButtonStatus();
        Assert.assertEquals(status,true);
    }



}
