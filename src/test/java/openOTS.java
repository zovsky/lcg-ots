import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class openOTS extends A_BaseTest
{

    @Test (enabled = true)
    public void searchForLocation() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        Assert.assertEquals(app.otsFrame.panelText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        Assert.assertTrue(app.otsFrame.resultSummary.shouldBe(Condition.visible).getText().contains("2 Tutor Time School"));

    }

    @Test (enabled = true)
    public void selectSchoolFromList() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.click();

        Assert.assertEquals(app.otsFrame.virtualText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");

    }

    @Test (enabled = true)
    public void confirmSelectedSchool() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.click();
        app.otsFrame.nextConfirmSchoolButton.click();

        Assert.assertEquals(app.otsFrame.selectTypeText.getText(), "Select an Appointment Type");
    }

    @Test (enabled = true)
    public void selectVirtualTour() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.click();
        app.otsFrame.nextConfirmSchoolButton.click();
        app.otsFrame.virtualTourButton.click();

        Assert.assertEquals(app.otsFrame.selectedSchoolName.shouldBe(Condition.visible).getText(),
                "Tutor Time of Austin, TX");
    }

    @Test (enabled = true)
    public void selectInPersonTour() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.click();
        app.otsFrame.nextConfirmSchoolButton.click();
        app.otsFrame.inPersonTourButton.click();

        Assert.assertEquals(app.otsFrame.selectedSchoolName.shouldBe(Condition.visible).getText(),
                "Tutor Time of Austin, TX");
    }

    @Test (enabled = true)
    public void selectDateAndTime() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.click();
        app.otsFrame.nextConfirmSchoolButton.click();
        app.otsFrame.inPersonTourButton.click();

        app.otsFrame.tomorrow.click();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.shouldBe(Condition.visible).is(Condition.disabled));

        app.otsFrame.secondTimeslot.click();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.is(Condition.enabled));
        sleep(3000);
        app.otsFrame.nextButtonCalendar.scrollTo().click();

        Assert.assertTrue(app.otsFrame.instructions.shouldBe(Condition.visible).getText()
                .contains("To confirm and schedule your Tutor Time of Austin, TX"));

    }

    @Test (enabled = true)
    public void fillForm() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.enabled).click();

        app.otsFrame.selectFirstSchoolButton.shouldBe(Condition.visible).click();
        app.otsFrame.nextConfirmSchoolButton.shouldBe(Condition.visible).click();
        app.otsFrame.inPersonTourButton.shouldBe(Condition.visible).click();

        app.otsFrame.tomorrow.click();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.shouldBe(Condition.visible).is(Condition.disabled));

        app.otsFrame.secondTimeslot.click();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.is(Condition.enabled));
        sleep(3000);
        app.otsFrame.nextButtonCalendar.scrollTo().click();

        app.otsFrame.firstName.sendKeys("first");
        app.otsFrame.lastName.sendKeys("last");
        app.otsFrame.phone.sendKeys("6574342222");
        app.otsFrame.email.sendKeys("VALIDTT@EXAMPLE.COM");
        app.otsFrame.child1Name.sendKeys("name");
        sleep(1000);
        app.otsFrame.typeDate("11112011");
        app.otsFrame.submitButton.click();
        sleep(1000);

        Assert.assertEquals(app.otsFrame.thankYou.shouldBe(Condition.visible).getText(),
                "Thank You!");

    }

}
