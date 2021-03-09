import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.*;

public class openOTS extends A_BaseTest
{
    @Test (enabled = true)
    public void panelTextShouldBeVisible() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        Assert.assertEquals(app.otsFrame.panelText.shouldBe(Condition.visible).getText(),
                "Virtual tours may be available and you will have the option to select this in the coming steps.");

    }

    @Test (enabled = true)
    public void searchForLocation() {
        app.homePage.open();
        app.homePage.otsEyebrow.click();

        app.otsFrame.switchToFrame();

        app.otsFrame.locationField.shouldBe(Condition.visible).sendKeys("TX");
        app.otsFrame.searchButton.shouldBe(Condition.visible).click();

        Assert.assertTrue(app.otsFrame.resultSummary.shouldBe(Condition.visible).getText().contains("Tutor Time School"));

    }

}
