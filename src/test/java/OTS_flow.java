import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OTS_flow extends A_BaseTest {

    @Test (enabled = true)
    public void t01_searchForLocation() {

        app.homePage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();

        Assert.assertEquals(app.otsFrame.panelText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");

    }

    @Test (enabled = true)
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

    @Test (enabled = true)
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
}
