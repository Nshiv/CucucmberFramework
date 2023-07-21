package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils
{
    public WebDriver driver;
    public  GenericUtils(WebDriver driver)
    {
        this.driver=driver;
    }
    public void switchWindowToChild()
    {
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childwindow= it.next();
        driver.switchTo().window(childwindow);
    }

}
