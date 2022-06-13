package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DepartureFlightPage;
import pages.UnitedAirlinesHomePage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;
    WebDriverWait explicitWait;
    Wait fluentWait;
    UnitedAirlinesHomePage unitedAirlinesHomePage;
    DepartureFlightPage departureFlightPage;
    Actions actions;


    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        unitedAirlinesHomePage = new UnitedAirlinesHomePage(driver);
        departureFlightPage = new DepartureFlightPage(driver);
        actions = new Actions(driver);
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}