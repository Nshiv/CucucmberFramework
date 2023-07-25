package stepDefinitions.practiceWebStepDefinition;

import org.openqa.selenium.devtools.v112.memory.model.Module;
import pageObjects.practiceWebPageObjects.MouseHoverPage;
import utilities.ContextSetUp;

public class MouseHouverStepdef
{
    public ContextSetUp contextSetUp;
    public MouseHoverPage mouseHoverPage;

    public MouseHouverStepdef(ContextSetUp contextSetUp)
    {
        this.contextSetUp= contextSetUp;
        mouseHoverPage= contextSetUp.pageObjectManager.getMouseHoverPage();
    }




}
