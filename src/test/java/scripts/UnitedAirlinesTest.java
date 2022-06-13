package scripts;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DepartureFlightPage;

public class UnitedAirlinesTest extends Base{

    @Test(priority = 1, description = "TC1: Validate Page Main menu navigation items")
    public void testMainMenuItems(){
        driver.get("https://www.united.com/en/us");

        for (WebElement element : unitedAirlinesHomePage.mainMenuNavigation) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Test(priority = 2, description = "TC2: Validate Book travel menu navigation items")
    public void testBookTravelMenuItems(){
        driver.get("https://www.united.com/en/us");

        for (WebElement element : unitedAirlinesHomePage.bookTravelMenuNavigation) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Test(priority = 3, description = "TC3: Validate Round-trip and One-way radio buttons")
    public void testRoundTripOneWayRadioButtons(){
        driver.get("https://www.united.com/en/us");

        Assert.assertEquals(unitedAirlinesHomePage.roundTripText.getText(), "Roundtrip");
        Assert.assertTrue(unitedAirlinesHomePage.roundTripRadioButton.isEnabled());
        Assert.assertTrue(unitedAirlinesHomePage.roundTripRadioButton.isSelected());
        Assert.assertEquals(unitedAirlinesHomePage.oneWayText.getText(), "One-way");
        Assert.assertTrue(unitedAirlinesHomePage.oneWayRadioButton.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.oneWayRadioButton.isSelected());

        unitedAirlinesHomePage.oneWayRadioButton.click();
        Assert.assertTrue(unitedAirlinesHomePage.oneWayRadioButton.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.roundTripRadioButton.isSelected());
    }

    @Test(priority = 4, description = "TC4: Validate Book with miles and Flexible dates checkboxes")
    public void testBookWithMilesAndFlexibleDatesCheckboxes(){
        driver.get("https://www.united.com/en/us");

        Assert.assertEquals(unitedAirlinesHomePage.bookWithMilesText.getText(), "Book with miles");
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected());
        Assert.assertEquals(unitedAirlinesHomePage.flexibleDatesText.getText(), "Flexible dates");
        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected());

        actions.click(unitedAirlinesHomePage.bookWithMilesCheckbox).perform();
        actions.click(unitedAirlinesHomePage.flexibleDatesCheckbox).perform();

        unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected();
        unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected();

        actions.click(unitedAirlinesHomePage.bookWithMilesCheckbox).perform();
        actions.click(unitedAirlinesHomePage.flexibleDatesCheckbox).perform();
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected());
    }

    @Test(priority = 5, description = "TC5: Validate One-way ticket search results from Chicago, IL, US (ORD) to Miami, FL, US (MIA)")
    public void testOnewayTicketResults(){
        driver.get("https://www.united.com/en/us");

        unitedAirlinesHomePage.oneWayRadioButton.click();
        unitedAirlinesHomePage.fromInputBox.clear();
        unitedAirlinesHomePage.fromInputBox.sendKeys("Chicago, IL, US (ORD)" + Keys.ENTER);
        unitedAirlinesHomePage.toInputBox.clear();
        unitedAirlinesHomePage.toInputBox.sendKeys("Miami, FL, US (MIA)" + Keys.ENTER);
        unitedAirlinesHomePage.datesInputBox.clear();
        unitedAirlinesHomePage.datesInputBox.click();
        unitedAirlinesHomePage.datesInputBox.sendKeys("01/30/2023" + Keys.ENTER);
        unitedAirlinesHomePage.travelersInputBox.click();
        unitedAirlinesHomePage.adultTravelerPlusButton.click();
        unitedAirlinesHomePage.travelerInfoCloseButton.click();
        unitedAirlinesHomePage.cabinTypeInputBox.click();
        unitedAirlinesHomePage.cabinDropdown.get(2).click();

        unitedAirlinesHomePage.findFlightsButton.click();

    }
}
