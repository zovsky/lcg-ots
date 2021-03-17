import com.codeborne.selenide.Condition;
import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners (value = AssumptionListener.class)
public class OTS_fromInfantsPage extends A_BaseTest {

    public boolean infantsBrands() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "lapetite.com", "childrenscourtyard.com")
                .contains(TestConfig.domain)) return true;
        else return false;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "infantsBrands")
    public void t01_submitOTSfromInfantsPage() {
        app.infantsPage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.searchForLocation();
        app.otsFrame.clickSearchButton();
        app.otsFrame.selectFirstSchool();
        app.otsFrame.clickNextConfirmSchoolButton();
        app.otsFrame.selectInPersonTour();
        app.otsFrame.selectTomorrow();
        app.otsFrame.selectSecondTimeslot();
        sleep(3000);
        app.otsFrame.clickNextButtonCalendar(); //todo uncomment
//        app.otsFrame.fillOTSFormAndSubmit();
//        Assert.assertEquals(app.otsFrame.thankYou.shouldBe(Condition.visible).getText(),
//                "Thank You!");
    }
}
