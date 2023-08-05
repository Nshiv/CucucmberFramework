package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.practiceWebPageObjects.TabsPage;
import utilities.ContextSetUp;

public class TabsStepDefinition
{
    public ContextSetUp contextSetUp;
    public TabsPage tabsPage;

    public TabsStepDefinition(ContextSetUp contextSetUp)
    {
        this.contextSetUp= contextSetUp;
        tabsPage=contextSetUp.pageObjectManager.getTabsPage();
    }

    @When("User click on open tab button")
    public void user_opened_newTab()
    {
        tabsPage.clickOnTabsButton();
    }

    @Then("User navigate to opened tab")
    public void switch_to_openedTabHandle()
    {
        tabsPage.switchToChildtabHandle();
    }

    @And("Validate the URL and Title of the tab")
    public void validate_url_title_ofTab()
    {
        String expectedTitle = "QAClick Academy - A Testing Academy to Learn, Earn and Shine";
        String expectedURL ="https://www.qaclickacademy.co";
        Assert.assertEquals(tabsPage.getTitle().toLowerCase().trim(),expectedTitle.toLowerCase().trim());
        Assert.assertEquals(tabsPage.getUrl().trim(),expectedURL.trim());
    }

    @And("Navigate Back to main tab")
    public void navigate_back_to_main_tab()
    {
        tabsPage.switchToParentTabHandle();
    }
}
