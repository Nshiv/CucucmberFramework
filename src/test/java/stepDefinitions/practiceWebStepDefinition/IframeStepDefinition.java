package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.IframePage;
import utilities.ContextSetUp;

public class IframeStepDefinition
{
    public ContextSetUp contextSetUp;
    public IframePage iframePage;

    public IframeStepDefinition(ContextSetUp contextSetUp)
    {
        this.contextSetUp=contextSetUp;
        iframePage=contextSetUp.pageObjectManager.getIframePage();
    }

    @When("User navigate to iframe")
    public void user_navigates_to_iframe()
    {
        iframePage.switchToiFrame();
    }

    @Then("Get validate the logo present on frame")
    public void validate_logo_on_iframe()
    {
        Boolean logoStatus = iframePage.getlogoElement();
        System.out.println(logoStatus);
        Assert.assertTrue(logoStatus);
    }
    @And("Navigate back to main Homepage")
    public void navigate_back_to_main_page()
    {
        iframePage.switchToMainSCreen();
    }
}
