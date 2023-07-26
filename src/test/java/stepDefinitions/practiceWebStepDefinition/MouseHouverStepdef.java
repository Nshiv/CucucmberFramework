package stepDefinitions.practiceWebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.memory.model.Module;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.practiceWebPageObjects.MouseHoverPage;
import utilities.ContextSetUp;
import utilities.WebDriverWaitUtils;

import javax.lang.model.element.Element;
import java.util.List;

public class MouseHouverStepdef
{
    public ContextSetUp contextSetUp;
    public MouseHoverPage mouseHoverPage;

    public MouseHouverStepdef(ContextSetUp contextSetUp)
    {
        this.contextSetUp= contextSetUp;
        mouseHoverPage= contextSetUp.pageObjectManager.getMouseHoverPage();
    }

    @When("User mouse hover on elements")
   public void user_perform_mouse_hover()
    {
        mouseHoverPage.performMouseHover();
    }

    @Then("Get list of elements displays")
    public void getElements_list() throws InterruptedException {
        Thread.sleep(3000);
        List<String> elementsList=mouseHoverPage.getListofMouseHoverElement();
        String[] array = {"Top","Reload"};
        for(String elemt : elementsList)
        {
            boolean found = false;
            for(String arrElement : array)
            {
                if(arrElement.equals(elemt))
                {
                    found=true;
                }
            }
            Assert.assertTrue(found);
        }



    }



}
