import com.codeborne.selenide.Condition;
import helpers.BrandDataSwitch;
import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(value = AssumptionListener.class)
public class OTS_flow extends A_BaseTest {

    @Test (enabled = true, retryAnalyzer = Retry.class)
    public void t01_searchForLocation() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        Assert.assertEquals(app.otsFrame.panelText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    public void t02_selectSchoolFromList() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        Assert.assertEquals(app.otsFrame.virtualText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    public void t03_confirmSelectedSchool() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        Assert.assertEquals(app.otsFrame.selectTypeText.getText(), "Select an Appointment Type");
    }

    public boolean onlyDomainsThatHaveVitualTourType() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveVitualTourType")
    public void t04_selectVirtualTour() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        app.otsFrame.selectVirtualTour();
        Assert.assertEquals(app.otsFrame.selectedSchoolName.shouldBe(Condition.visible).getText(),
                BrandDataSwitch.getStep4ExpectedText());
    }

    public boolean onlyDomainsThatHaveInPersonTourType() {
        if (Arrays.asList("pathwayslearningacademy.com").contains(TestConfig.domain) &&
            Arrays.asList("https://www.").contains(TestConfig.env)) {
            app.homePage.open();
            return false;
        }
        else {
            return true;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveInPersonTourType")
    public void t05_selectInPersonTour() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        app.otsFrame.selectInPersonTour();

        Assert.assertEquals(app.otsFrame.selectedSchoolName.shouldBe(Condition.visible).getText(),
                BrandDataSwitch.getStep4ExpectedText());
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    public void t06_selectDateAndTime() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        app.otsFrame.selectFirstTourType();
        app.otsFrame.selectTomorrow();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.shouldBe(Condition.visible).is(Condition.disabled));
        app.otsFrame.selectSecondTimeslot();
        Assert.assertTrue(app.otsFrame.nextButtonCalendar.is(Condition.enabled));
        sleep(3000);
        app.otsFrame.clickNextButtonCalendar();
        Assert.assertTrue(app.otsFrame.instructions.shouldBe(Condition.visible).getText()
                .contains(BrandDataSwitch.getStep5ExpectedText()));

    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    public void t07_fillForm() {
        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        app.otsFrame.selectFirstTourType();
        app.otsFrame.selectTomorrow();
        app.otsFrame.selectSecondTimeslot();
        sleep(3000);
        app.otsFrame.clickNextButtonCalendar();
        app.otsFrame.fillOTSFormAndSubmit();
        Assert.assertEquals(app.otsFrame.thankYou.shouldBe(Condition.visible).getText(),
                "Thank You!");
    }
}
