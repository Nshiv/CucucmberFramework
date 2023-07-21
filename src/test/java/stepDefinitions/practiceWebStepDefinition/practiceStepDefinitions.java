package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.RadioButtonElements;
import utilities.ContextSetUp;

import java.util.List;

public class practiceStepDefinitions
{
    public ContextSetUp contextSetUp;
    public RadioButtonElements radioButtonElements;
    public practiceStepDefinitions(ContextSetUp contextSetUp)
    {
        this.contextSetUp=contextSetUp;
    }

    @Given("User is on Practice Landing Page")
    public void user_on_practiceLandingScreen()
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

    @When("User get all displayed list of radio buttons on page")
    public int user_get_list_of_allRadiobuttons()
    {
        radioButtonElements= contextSetUp.pageObjectManager.getRadioButtonElements();
        List<WebElement> radioButtons =radioButtonElements.getAllRadioButtons();
        return radioButtons.size();
    }

    @Then("All approved Radio buttons should be on screen")
    public void validate_approved_radioButtons_count()
    {
        int approved_count =3;
        Assert.assertEquals(user_get_list_of_allRadiobuttons(),approved_count);
    }

    @When("^User get radio button heading texts on screen$")
    public String getText_of_RadioButtons_element()
    {
       String heading= radioButtonElements.getHeadingOfRadioButtons().toLowerCase().trim();
       return heading;
    }

    @Then("^Text should be mached with (.+)$")
    public void validate_radioButtons_heading(String texts )
    {
      Assert.assertEquals(getText_of_RadioButtons_element(),texts.toLowerCase().trim());
    }



}
