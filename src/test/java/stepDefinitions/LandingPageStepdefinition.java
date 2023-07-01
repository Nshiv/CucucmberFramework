package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utilities.ContextSetUp;


import java.util.Iterator;
import java.util.Set;

public class LandingPageStepdefinition
{
    public WebDriver driver;
    public String landingProductName;
    public String offersSearchedResult;
    public PageObjectManager pageObjectManager;
    ContextSetUp context;
    public LandingPageStepdefinition(ContextSetUp context)
    {
       this.context=context;
    }
    String path="C:/Driver/chromedriver/chromedriver.exe";
    @Given("User on GreenCart Landing page")
    public void user_on_green_cart_landing_page()
    {
        System.setProperty("webdriver.chrome.driver",path);
        context.driver = new ChromeDriver();
        context.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("User searched with short name {string} and extracted actual name of product")
    public void user_searched_landingScreen(String shortName) throws InterruptedException {
        System.out.println(shortName);
        pageObjectManager = new PageObjectManager(context.driver);
        LandingPage landingPage = pageObjectManager.getlandingPage();
        landingPage.setSearchInput(shortName);
        //context.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(5000);
        landingProductName=landingPage.getProductName();
        System.out.println(landingProductName);


    }




}
