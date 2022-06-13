package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UnitedAirlinesHomePage {
    public UnitedAirlinesHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[role='tablist']>a")
    public List<WebElement> mainMenuNavigation;

    @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj']>li")
    public List<WebElement> bookTravelMenuNavigation;

    @FindBy(xpath = "//label[@for='roundtrip']//span[2]")
    public WebElement roundTripRadioButton;

    @FindBy(xpath = "//label[@for='roundtrip']//span[1]")
    public WebElement roundTripText;

    @FindBy(xpath = "//label[@for='oneway']//span[2]")
    public WebElement oneWayRadioButton;

    @FindBy(xpath = "//label[@for='oneway']//span[1]")
    public WebElement oneWayText;

    @FindBy(id = "award")
    public WebElement bookWithMilesCheckbox;

    @FindBy(xpath = "//div[@aria-label='Book with miles']//span")
    public WebElement bookWithMilesText;

    @FindBy(css = "#flexibleDates")
    public WebElement flexibleDatesCheckbox;

    @FindBy(css = "#flexDatesLabel>span")
    public WebElement flexibleDatesText;

    @FindBy(id = "#bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "#bookFlightDestinationInput")
    public WebElement toInputBox;

    @FindBy(id = "DepartDate")
    public WebElement datesInputBox;

    @FindBy (css = "div[id=passengerSelector]>button")
    public WebElement travelersInputBox;

    @FindBy(css = "button[aria-label='Substract one Adult']")
    public WebElement adultTravelerPlusButton;

    @FindBy (css = "button[class='atm-c-btn atm-c-btn--bare']")
    public WebElement travelerInfoCloseButton;

    @FindBy (id = "cabinType")
    public WebElement cabinTypeInputBox;

    @FindBy(css = "ul[role='listbox']>li")
    public List<WebElement> cabinDropdown;

    @FindBy(css = "button[aria-label='Find flights']")
    public WebElement findFlightsButton;

}
