package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.BrowserWindow;
import utilities.ContextSetUp;

public class HandleWindowStepDef
{
    public ContextSetUp contextSetUp;
    public BrowserWindow browserWindow;
    public HandleWindowStepDef(ContextSetUp contextSetUp)
    {
        this.contextSetUp=contextSetUp;
        browserWindow= contextSetUp.pageObjectManager.getBrowserWindow();
    }

    @When("User click on open window button")
    public void user_click_on_openWindowHanlde_Button()
    {
        browserWindow.clickWindowHandleButton();
    }
    @Then("User switched to opened child window")
    public void switch_to_child_window()
    {
        browserWindow.navigateToChildWindow();
    }
    @And("Validate the URL and Title of the window")
    public void validate_title_andUrl()
    {
     String expectedTitle = "QAClick Academy - A Testing Academy to Learn, Earn and Shine";
     String expectedURL ="http://www.qaclickacademy.com/";
     Assert.assertEquals(expectedURL,browserWindow.getUrl());
     Assert.assertEquals(browserWindow.getTitle().toLowerCase(),expectedTitle.toLowerCase().trim());

    }
    @And("Navigate Back to Parent Window")
    public void navigate_to_parentwindow()
    {
        browserWindow.switchToParentWindow();
    }
}
