package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.DropDown;
import utilities.ContextSetUp;

import java.util.List;

public class DropDownStepDefinition
{
    public ContextSetUp contextSetUp;
    public DropDown dropdown;

    public DropDownStepDefinition(ContextSetUp contextSetUp)
    {
        this.contextSetUp= contextSetUp;
        dropdown=contextSetUp.pageObjectManager.getDropdown();
    }

    @Given("User select first dropdown value by Index {int}")
    public void select_value_from_dropdown_withValue(int index)
    {
      dropdown.selectByIndex(1);
    }

    @Then("Corresponding value should be selected")
    public void validate_selected_value()
    {
       String actual = dropdown.getSelectedDropDownText().toLowerCase().trim();
       String expected ="Option1";
        Assert.assertEquals(actual,expected.toLowerCase().trim());
    }

    @When("User select dropdown value of last index")
    public void select_last_dropdown_value()
    {
        dropdown.selectLastValue();
    }

    @Then("Validate the last value selected")
    public void validate_last_selected_value()
    {
       String actual= dropdown.getSelectedDropDownText().toLowerCase().trim();
       String expected ="Option3";
       Assert.assertEquals(actual,expected.toLowerCase().trim());
    }

    @When("User select a dropdown value by value")
     public void select_droplist_byValue()
    {
     dropdown.selectByValue("option2");
    }

    @And("User deselect selected value")
    public void deselect_dropdown_withSelectedValue()
    {
        dropdown.refresh();
    }

    @Then("Validate droplist values should not be selected")
    public void validate_current_state_of_dropList()
    {

      List<WebElement> data =dropdown.getAllSelectedValues();
        for(WebElement op : data)
        {
            Assert.assertEquals(op.getText(),"Select");
        }


    }






}
